package com.ahmedapps.roomdatabase.presentation

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmedapps.roomdatabase.data.Note
import com.ahmedapps.roomdatabase.data.NoteDao
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NotesViewModel(
    private val dao: NoteDao
) : ViewModel() {

    private val isSortedByDateAdded = MutableStateFlow(true)

    private var notes =
        isSortedByDateAdded.flatMapLatest { sort ->
            if (sort) {
                dao.getNotesOrderdByDateAdded()
            } else {
                dao.getNotesOrderdByTitle()
            }
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

    val _state = MutableStateFlow(NoteState())
    val state =
        combine(_state, isSortedByDateAdded, notes) { state, isSortedByDateAdded, notes ->
            state.copy(
                notes = notes
            )
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), NoteState())

    fun onEvent(event: NotesEvent) {
        when (event) {
            is NotesEvent.DeleteNoteConfirmation -> {
                _state.update {
                    it.copy(deletingNote = event.note)
                }
            }

            is NotesEvent.ConfirmDeleteNote -> {
                if (event.confirmation) {
                    val noteToDelete = _state.value.deletingNote
                    if (noteToDelete != null) {
                        viewModelScope.launch {
                            dao.deleteNote(noteToDelete)
                            // Clear the deletingNote state after deletion
                            _state.update {
                                it.copy(deletingNote = null)
                            }
                        }
                    }
                } else {
                    // User declined to delete, clear the deletingNote state
                    _state.update {
                        it.copy(deletingNote = null)
                    }
                }
            }

            is NotesEvent.SaveNote -> {
                if (_state.value.isValid()) {
                    val note = Note(
                        title = _state.value.title.value.trim(),
                        description = _state.value.description.value.trim(),
                        dateAdded = System.currentTimeMillis()
                    )

                    viewModelScope.launch {
                        dao.upsertNote(note)
                    }

                    _state.update {
                        it.copy(
                            title = mutableStateOf(""),
                            description = mutableStateOf("")
                        )
                    }
                }
            }

            NotesEvent.SortNotes -> {
                isSortedByDateAdded.value = !isSortedByDateAdded.value
            }

            else -> {}
        }
    }
}

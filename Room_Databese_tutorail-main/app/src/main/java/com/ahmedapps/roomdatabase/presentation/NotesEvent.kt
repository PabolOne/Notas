package com.ahmedapps.roomdatabase.presentation

import com.ahmedapps.roomdatabase.data.Note

sealed interface NotesEvent {
    object SortNotes: NotesEvent

    data class DeleteNoteConfirmation(val note: Note): NotesEvent

    data class ConfirmDeleteNote(val confirmation: Boolean): NotesEvent

    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvent
}

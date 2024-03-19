package com.ahmedapps.roomdatabase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003JE\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0006\u0010\u001c\u001a\u00020\u0018J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/NoteState;", "", "notes", "", "Lcom/ahmedapps/roomdatabase/data/Note;", "title", "Landroidx/compose/runtime/MutableState;", "", "description", "deletingNote", "(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/ahmedapps/roomdatabase/data/Note;)V", "getDeletingNote", "()Lcom/ahmedapps/roomdatabase/data/Note;", "getDescription", "()Landroidx/compose/runtime/MutableState;", "getNotes", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "isValid", "toString", "app_debug"})
public final class NoteState {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.ahmedapps.roomdatabase.data.Note> notes = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> description = null;
    @org.jetbrains.annotations.Nullable
    private final com.ahmedapps.roomdatabase.data.Note deletingNote = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.ahmedapps.roomdatabase.presentation.NoteState copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.ahmedapps.roomdatabase.data.Note> notes, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> title, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> description, @org.jetbrains.annotations.Nullable
    com.ahmedapps.roomdatabase.data.Note deletingNote) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public NoteState() {
        super();
    }
    
    public NoteState(@org.jetbrains.annotations.NotNull
    java.util.List<com.ahmedapps.roomdatabase.data.Note> notes, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> title, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> description, @org.jetbrains.annotations.Nullable
    com.ahmedapps.roomdatabase.data.Note deletingNote) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahmedapps.roomdatabase.data.Note> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahmedapps.roomdatabase.data.Note> getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ahmedapps.roomdatabase.data.Note component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ahmedapps.roomdatabase.data.Note getDeletingNote() {
        return null;
    }
    
    public final boolean isValid() {
        return false;
    }
}
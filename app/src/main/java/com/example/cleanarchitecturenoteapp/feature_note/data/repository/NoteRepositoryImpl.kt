package com.example.cleanarchitecturenoteapp.feature_note.data.repository

import com.example.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao
import com.example.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.example.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl (
    private val deo: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return deo.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return deo.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return deo.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return deo.deleteNote(note)
    }
}
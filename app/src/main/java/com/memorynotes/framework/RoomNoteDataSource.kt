package com.memorynotes.framework

import android.content.Context
import com.accenture.core.data.Note
import com.accenture.core.repository.NoteDataSource
import com.memorynotes.framework.db.DatabaseService
import com.memorynotes.framework.db.NoteEntity

class RoomNoteDataSource(context: Context) : NoteDataSource {

    val noteDao = DatabaseService.getInstance(context).noteDao()

    override suspend fun add(note: Note) = noteDao.addNoteEntity(NoteEntity.fromNote(note))

    override suspend fun get(id: Long) = noteDao.getNoteEntity(id)?.toNote()

    override suspend fun getAll() = noteDao.getAllNoteEntities().map { it.toNote() }

    override suspend fun remove(note: Note) = noteDao.deletNoteEntenty(NoteEntity.fromNote(note))
}
package com.accenture.core.usecase

import com.accenture.core.data.Note
import com.accenture.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note:Note) = noteRepository.addNote(note)
}
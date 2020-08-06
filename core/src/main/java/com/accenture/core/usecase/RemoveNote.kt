package com.accenture.core.usecase

import com.accenture.core.data.Note
import com.accenture.core.repository.NoteRepository

class RemoveNote (private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}
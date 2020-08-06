package com.memorynotes.framework.di

import android.app.Application
import com.accenture.core.repository.NoteRepository
import com.memorynotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}
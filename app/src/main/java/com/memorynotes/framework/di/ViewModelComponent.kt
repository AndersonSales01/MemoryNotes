package com.memorynotes.framework.di

import com.memorynotes.framework.ListViewModel
import com.memorynotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class,RepositoryModule::class,UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}
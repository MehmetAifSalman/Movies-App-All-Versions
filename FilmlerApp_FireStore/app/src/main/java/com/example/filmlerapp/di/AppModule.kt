package com.example.filmlerapp.di

import com.example.filmlerapp.data.Repo.FilmlerRepository
import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun providesFilmlerDataSource(CollectionFilmler : CollectionReference)  :  FilmlerDataSource {
        return FilmlerDataSource(CollectionFilmler)
    }

    @Provides
    @Singleton
    fun providesFilmlerRepository( FDS : FilmlerDataSource)  :  FilmlerRepository{
        return FilmlerRepository(FDS)
    }

    @Provides
    @Singleton
    fun providesCollectionReferance() : CollectionReference
    {
        return Firebase.firestore.collection("Filmler")
    }
}
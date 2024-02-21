package com.example.filmlerapp.di

import com.example.filmlerapp.data.Repo.FilmlerRepository
import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.retrofit.ApiUtils
import com.example.filmlerapp.retrofit.FilmerDao
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
    fun providesFilmlerDataSource(fdao : FilmerDao)  :  FilmlerDataSource {
        return FilmlerDataSource(fdao)
    }

    @Provides
    @Singleton
    fun providesFilmlerRepository( FDS : FilmlerDataSource)  :  FilmlerRepository{
        return FilmlerRepository(FDS)
    }

    @Provides
    @Singleton
    fun providesFilmlerDao() : FilmerDao
    {
        return ApiUtils.getFilmlerDao()
    }
}
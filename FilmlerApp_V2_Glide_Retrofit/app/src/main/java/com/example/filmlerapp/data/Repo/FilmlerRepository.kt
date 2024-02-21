package com.example.filmlerapp.data.Repo

import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.entity.Filmler

class FilmlerRepository (var FDS : FilmlerDataSource){

    suspend fun filmleriYukle() : List<Filmler> = FDS.filmleriYukle()
}
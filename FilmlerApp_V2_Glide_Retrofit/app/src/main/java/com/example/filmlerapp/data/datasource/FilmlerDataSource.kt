package com.example.filmlerapp.data.datasource

import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.retrofit.FilmerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var fdao : FilmerDao) {
    suspend fun filmleriYukle() : List<Filmler> =
        withContext(Dispatchers.IO){

            return@withContext fdao.filmleriYukle().filmler
        }
}
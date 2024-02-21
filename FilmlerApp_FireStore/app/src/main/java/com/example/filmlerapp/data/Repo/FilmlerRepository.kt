package com.example.filmlerapp.data.Repo

import androidx.lifecycle.MutableLiveData
import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.entity.Filmler

class FilmlerRepository (var FDS : FilmlerDataSource){

     fun filmleriYukle() : MutableLiveData<List<Filmler>> = FDS.filmleriYukle()
}
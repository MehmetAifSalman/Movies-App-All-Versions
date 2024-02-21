package com.example.filmlerapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmlerapp.data.Repo.FilmlerRepository
import com.example.filmlerapp.data.entity.Filmler
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor (var frepo : FilmlerRepository) : ViewModel() {
    var filmlerListesi = MutableLiveData<List<Filmler>>()

    init {
        filmleriYukle()
    }


    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
          filmlerListesi.value =  frepo.filmleriYukle()
        }
    }
}
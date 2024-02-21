package com.example.filmlerapp.retrofit

class ApiUtils {

    companion object{
        var BaseURL = "http://kasimadalan.pe.hu/"

        fun getFilmlerDao() : FilmerDao
        {
            return RetrofitClient.getClient(BaseURL).create(FilmerDao::class.java)
        }
    }

}
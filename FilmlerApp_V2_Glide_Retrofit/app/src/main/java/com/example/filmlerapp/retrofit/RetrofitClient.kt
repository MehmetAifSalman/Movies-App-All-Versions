package com.example.filmlerapp.retrofit


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.LinkedList

class RetrofitClient {
    //Static parse edici
    companion object{
        fun getClient(baseURL : String) : Retrofit
        {
            return Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}
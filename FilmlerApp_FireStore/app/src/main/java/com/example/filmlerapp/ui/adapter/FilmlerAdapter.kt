package com.example.filmlerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.filmlerapp.R
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.databinding.CardTasarimBinding
import com.example.filmlerapp.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext: Context , var FilmlerListesi : List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>()
{

    inner class CardTasarimTutucu(var tasarim : CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        var binding : CardTasarimBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_tasarim , parent , false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = FilmlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(film.resim , "drawable" , mContext.packageName))
        t.filmNesnesi = film
        t.buttonSepet.setOnClickListener {
            Snackbar.make(it , "${film.ad} sepete eklendi", Snackbar.LENGTH_SHORT).show()
        }

        t.imageViewFilm.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    override fun getItemCount(): Int {
        return FilmlerListesi.size
    }
}
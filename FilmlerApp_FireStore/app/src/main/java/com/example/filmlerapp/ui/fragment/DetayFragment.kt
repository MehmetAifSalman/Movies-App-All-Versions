package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.filmlerapp.R
import com.example.filmlerapp.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {

    private lateinit var binding : FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bundle : DetayFragmentArgs by navArgs()
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detay, container, false)
        val film = bundle.film
        binding.filmNesnesi = bundle.film
        binding.ivResim.setImageResource(
            resources.getIdentifier(film.resim , "drawable" , requireContext().packageName)
        )
        binding.tvFiyat.text = "${film.fiyat} TL"

        return binding.root
    }

}
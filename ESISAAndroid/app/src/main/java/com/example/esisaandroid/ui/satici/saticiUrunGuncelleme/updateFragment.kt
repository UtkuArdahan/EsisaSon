package com.example.esisaandroid.ui.satici.saticiUrunGuncelleme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.esisaandroid.databinding.FragmentUpdateBinding



class updateFragment : Fragment() {
    private lateinit var binding : FragmentUpdateBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUpdateBinding.inflate(inflater , container, false)



        return binding.root
    }


    }



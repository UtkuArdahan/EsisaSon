package com.example.esisaandroid.ui.bireyselAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.databinding.ActivityNikeHerBinding
import com.example.esisaandroid.databinding.ActivityStefanBinding

class NikeHerActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNikeHerBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding= ActivityNikeHerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
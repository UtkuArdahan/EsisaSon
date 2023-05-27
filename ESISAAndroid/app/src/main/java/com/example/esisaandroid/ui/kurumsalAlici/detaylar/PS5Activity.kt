package com.example.esisaandroid.ui.kurumsalAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding
import com.example.esisaandroid.databinding.ActivityPs5Binding

class PS5Activity : AppCompatActivity() {
    private lateinit var binding:ActivityPs5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityPs5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
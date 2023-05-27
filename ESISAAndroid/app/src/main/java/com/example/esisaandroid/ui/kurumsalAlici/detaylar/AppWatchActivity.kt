package com.example.esisaandroid.ui.kurumsalAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityAppWatchBinding
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding

class AppWatchActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAppWatchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityAppWatchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
package com.example.esisaandroid.ui.kurumsalAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.databinding.ActivityAcerKurBinding
import com.example.esisaandroid.databinding.ActivityJordanKurBinding

class JordanKurActivity : AppCompatActivity() {
    private lateinit var binding: ActivityJordanKurBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityJordanKurBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
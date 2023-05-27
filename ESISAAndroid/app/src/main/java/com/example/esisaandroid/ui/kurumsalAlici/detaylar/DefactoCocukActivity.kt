package com.example.esisaandroid.ui.kurumsalAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityDefactoCocukBinding
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding

class DefactoCocukActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDefactoCocukBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityDefactoCocukBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
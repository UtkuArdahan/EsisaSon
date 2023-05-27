package com.example.esisaandroid.ui.bireyselAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.databinding.ActivityAlkBinding
import com.example.esisaandroid.databinding.ActivityMsiBinding

class MsiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMsiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMsiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
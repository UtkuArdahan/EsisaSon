package com.example.esisaandroid.ui.bireyselAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.databinding.ActivityDefactoBinding
import com.example.esisaandroid.databinding.ActivityStefanBinding

class DefactoActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDefactoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityDefactoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
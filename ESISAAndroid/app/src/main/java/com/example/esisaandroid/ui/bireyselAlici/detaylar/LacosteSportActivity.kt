package com.example.esisaandroid.ui.bireyselAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.databinding.ActivityAcerKurBinding
import com.example.esisaandroid.databinding.ActivityLacosteSportBinding

class LacosteSportActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLacosteSportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityLacosteSportBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
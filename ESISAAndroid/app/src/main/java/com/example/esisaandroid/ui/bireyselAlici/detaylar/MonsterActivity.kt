package com.example.esisaandroid.ui.bireyselAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.databinding.ActivityAlkBinding
import com.example.esisaandroid.databinding.ActivityMonsterBinding

class MonsterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMonsterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMonsterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
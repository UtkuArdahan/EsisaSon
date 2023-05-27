package com.example.esisaandroid.ui.kurumsalAlici.detaylar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.databinding.ActivityGsBinding
import com.example.esisaandroid.databinding.ActivityHuaweiBinding
import com.example.esisaandroid.databinding.ActivityXaomiBinding
import com.example.esisaandroid.databinding.ActivityXiaomiKurBinding

class XiaomiKurActivity : AppCompatActivity() {
    private lateinit var binding: ActivityXiaomiKurBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityXiaomiKurBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDetailsAddToCart.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
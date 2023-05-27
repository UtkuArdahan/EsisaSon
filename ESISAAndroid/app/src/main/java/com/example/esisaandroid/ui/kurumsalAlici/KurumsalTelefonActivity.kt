package com.example.esisaandroid.ui.kurumsalAlici

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityKurumsalTelefonBinding
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding
import com.example.esisaandroid.ui.kurumsalAlici.detaylar.*

class KurumsalTelefonActivity : AppCompatActivity() {
    private lateinit var binding:ActivityKurumsalTelefonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityKurumsalTelefonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kartResim.setOnClickListener {
            val intent= Intent(applicationContext, Iphone11Activity::class.java)
            startActivity(intent)
        }
        binding.kartResim1.setOnClickListener {
            val intent= Intent(applicationContext, HuaweiKurActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim2.setOnClickListener {
            val intent= Intent(applicationContext, XiaomiKurActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button4.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button5.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }

    }
}
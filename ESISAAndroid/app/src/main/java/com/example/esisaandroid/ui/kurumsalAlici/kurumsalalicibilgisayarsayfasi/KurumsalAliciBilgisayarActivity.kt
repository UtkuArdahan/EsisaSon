package com.example.esisaandroid.ui.kurumsalAlici.kurumsalalicibilgisayarsayfasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityKurumsalAliciBilgisayarBinding
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding
import com.example.esisaandroid.ui.kurumsalAlici.detaylar.*

class KurumsalAliciBilgisayarActivity : AppCompatActivity() {
    private lateinit var binding:ActivityKurumsalAliciBilgisayarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityKurumsalAliciBilgisayarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kartResim.setOnClickListener {
            val intent= Intent(applicationContext, AsusRogActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim1.setOnClickListener {
            val intent= Intent(applicationContext, AcerKurActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim2.setOnClickListener {
            val intent= Intent(applicationContext, MonsterKurActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim3.setOnClickListener {
            val intent= Intent(applicationContext, MsiKurActivity::class.java)
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
        binding.button6.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }

    }
}
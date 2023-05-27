package com.example.esisaandroid.ui.bireyselAlici.bireyselalicibilgisayarsayfasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityBilgisayarBinding
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding
import com.example.esisaandroid.ui.bireyselAlici.detaylar.AcerActivity
import com.example.esisaandroid.ui.bireyselAlici.detaylar.AsusActivity
import com.example.esisaandroid.ui.bireyselAlici.detaylar.MonsterActivity
import com.example.esisaandroid.ui.bireyselAlici.detaylar.MsiActivity
import com.example.esisaandroid.ui.kurumsalAlici.detaylar.*

class BireyselAliciBilgisayarActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBilgisayarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityBilgisayarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kartResim.setOnClickListener {
            val intent= Intent(applicationContext, AsusActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim1.setOnClickListener {
            val intent= Intent(applicationContext, AcerActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim2.setOnClickListener {
            val intent= Intent(applicationContext, MonsterActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim3.setOnClickListener {
            val intent= Intent(applicationContext, MsiActivity::class.java)
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
package com.example.esisaandroid.ui.bireyselAlici.bireyselaliciayakkabisayfasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityAyakkabiBinding
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding
import com.example.esisaandroid.ui.kurumsalAlici.detaylar.*

class BireyselAliciAyakkabiActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAyakkabiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityAyakkabiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kartResim.setOnClickListener {
            val intent= Intent(applicationContext, SamsungBudsActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim1.setOnClickListener {
            val intent= Intent(applicationContext, ZweigActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim2.setOnClickListener {
            val intent= Intent(applicationContext, CalvinKleinActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim3.setOnClickListener {
            val intent= Intent(applicationContext, AsusRogActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim4.setOnClickListener {
            val intent= Intent(applicationContext, DefactoCocukActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim5.setOnClickListener {
            val intent= Intent(applicationContext, DeriKadinActivity::class.java)
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
        binding.button7.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button8.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }

    }
}
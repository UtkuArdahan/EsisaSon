package com.example.esisaandroid.ui.kurumsalAlici

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityKurumsalKitapBinding
import com.example.esisaandroid.databinding.ActivityOyuncakBireyselBinding
import com.example.esisaandroid.ui.kurumsalAlici.detaylar.*

class KurumsalKitapActivity : AppCompatActivity() {
    private lateinit var binding:ActivityKurumsalKitapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityKurumsalKitapBinding.inflate(layoutInflater)
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
        binding.kartResim6.setOnClickListener {
            val intent= Intent(applicationContext, AppWatchActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim7.setOnClickListener {
            val intent= Intent(applicationContext, GsActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim8.setOnClickListener {
            val intent= Intent(applicationContext, Iphone11Activity::class.java)
            startActivity(intent)
        }
        binding.kartResim9.setOnClickListener {
            val intent= Intent(applicationContext, GapActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim10.setOnClickListener {
            val intent= Intent(applicationContext, AltusAlkActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim11.setOnClickListener {
            val intent= Intent(applicationContext, NikeActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim12.setOnClickListener {
            val intent= Intent(applicationContext, PS5Activity::class.java)
            startActivity(intent)
        }
        binding.kartResim13.setOnClickListener {
            val intent= Intent(applicationContext, PumaActivity::class.java)
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
        binding.button9.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button10.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button11.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button12.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button13.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button14.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button15.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
        binding.button16.setOnClickListener {
            Toast.makeText(applicationContext,"Ürün sepetinize eklendi", Toast.LENGTH_LONG).show()
        }
    }
}
package com.example.esisaandroid.ui.bireyselAlici

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityTelefonBireyselBinding
import com.example.esisaandroid.ui.bireyselAlici.detaylar.HuaweiActivity
import com.example.esisaandroid.ui.bireyselAlici.detaylar.XaomiActivity
import com.example.esisaandroid.ui.kurumsalAlici.detaylar.*

class TelefonBireyselActivity : AppCompatActivity() {
    private lateinit var binding:ActivityTelefonBireyselBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityTelefonBireyselBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kartResim.setOnClickListener {
            val intent= Intent(applicationContext, Iphone11Activity::class.java)
            startActivity(intent)
        }
        binding.kartResim1.setOnClickListener {
            val intent= Intent(applicationContext, HuaweiActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim2.setOnClickListener {
            val intent= Intent(applicationContext, XaomiActivity::class.java)
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
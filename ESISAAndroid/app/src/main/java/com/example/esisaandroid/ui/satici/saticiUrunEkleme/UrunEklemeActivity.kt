package com.example.esisaandroid.ui.satici.saticiUrunEkleme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityUrunEklemeBinding
import com.example.esisaandroid.ui.satici.saticianasayfa.SaticiAnasayfaActivity
import com.google.firebase.database.FirebaseDatabase

class UrunEklemeActivity : AppCompatActivity() {
    private lateinit var binding:UrunEklemeActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityUrunEklemeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.butonlistegit.setOnClickListener {
            val intent=Intent(applicationContext,SaticiAnasayfaActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.productaddEklebuton.setOnClickListener {
            var etname=binding.txtProductaddName.text.toString().trim()
            var etprice=binding.txtProductaddPrice.text.toString().trim()
            var etdesc=binding.txtProductaddDesc.text.toString().trim()

            if(TextUtils.isEmpty(etname)){
                binding.txtProductaddName.error="Lütfen ürün ismini giriniz"
            }
            if (TextUtils.isEmpty(etprice)){
                binding.txtProductaddPrice.error="Lütfen ürün fiyatını giriniz"
            }
            if (TextUtils.isEmpty(etdesc)){
                binding.txtProductaddDesc.error="Lütfen ürün açıklamasını giriniz"
            }
            else{
                var database= FirebaseDatabase.getInstance()
                var databaseReferance=database.reference.child("Products")
                var id=databaseReferance.push()
                id.child("id").setValue(id.key.toString())
                id.child("isim").setValue(etname)
                id.child("fiyat").setValue(etprice)
                id.child("aciklama").setValue(etdesc)
                Toast.makeText(applicationContext,"Ürün eklendi", Toast.LENGTH_LONG).show()
            }
    }
}}
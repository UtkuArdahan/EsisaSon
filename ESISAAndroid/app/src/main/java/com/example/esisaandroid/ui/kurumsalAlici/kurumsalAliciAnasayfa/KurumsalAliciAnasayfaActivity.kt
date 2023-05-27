package com.example.esisaandroid.ui.kurumsalAlici.kurumsalAliciAnasayfa


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityKurumsalAliciAnasayfaBinding
import com.example.esisaandroid.ui.kurumsalAlici.kurumsalAliciHesabim.KurumsalAliciHesabimFragment
import com.example.esisaandroid.ui.kurumsalAlici.kurumsalAliciKategoriler.KurumsalAliciKategorilerFragment
import com.example.esisaandroid.ui.kurumsalAlici.kurumsalAliciSepetim.KurumsalAliciSepetimFragment


class KurumsalAliciAnasayfaActivity : AppCompatActivity() {
    private lateinit var binding:ActivityKurumsalAliciAnasayfaBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityKurumsalAliciAnasayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(KurumsalAliciAnasayfaFragment())
        binding.bottomNavigationView.setOnItemReselectedListener {
            when(it.itemId){
                R.id.home->replaceFragment(KurumsalAliciAnasayfaFragment())
                R.id.category->replaceFragment(KurumsalAliciKategorilerFragment())
                R.id.basket->replaceFragment(KurumsalAliciSepetimFragment())
                R.id.account->replaceFragment(KurumsalAliciHesabimFragment())
                else->{
                    replaceFragment(KurumsalAliciAnasayfaFragment())
                }

            }
            true
        }

    }
    private fun replaceFragment(fragment:Fragment){
        val fragmentManager= supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}
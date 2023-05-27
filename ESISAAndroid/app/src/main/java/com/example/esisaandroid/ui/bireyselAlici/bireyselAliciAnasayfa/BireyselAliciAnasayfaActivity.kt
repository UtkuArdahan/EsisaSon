package com.example.esisaandroid.ui.bireyselAlici.bireyselAliciAnasayfa


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.ActivityBireyselAliciAnasayfaBinding
import com.example.esisaandroid.ui.bireyselAlici.bireyselAliciHesabim.BireyselAliciHesabimFragment
import com.example.esisaandroid.ui.bireyselAlici.bireyselAliciKategoriler.BireyselAliciKategorilerFragment
import com.example.esisaandroid.ui.bireyselAlici.bireyselAliciSepetim.BireyselAliciSepetimFragment


class BireyselAliciAnasayfaActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBireyselAliciAnasayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityBireyselAliciAnasayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(BireyselAliciAnasayfaFragment())
        binding.bottomNavigationViewBireysel.setOnItemReselectedListener {
            when(it.itemId){
                R.id.homeBireysel->replaceFragment(BireyselAliciAnasayfaFragment())
                R.id.categoryBireysel->replaceFragment(BireyselAliciKategorilerFragment())
                R.id.basketBireysel->replaceFragment(BireyselAliciSepetimFragment())
                R.id.accountBireysel->replaceFragment(BireyselAliciHesabimFragment())
                else->{
                    replaceFragment(BireyselAliciAnasayfaFragment())
                }

            }
            true
        }

    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager= supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layoutBireysel,fragment)
        fragmentTransaction.commit()
    }


    }

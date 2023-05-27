package com.example.esisaandroid.ui.Girisler.bireyselAliciGiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.example.esisaandroid.databinding.ActivityPsifirlamaBinding
import com.example.esisaandroid.ui.girisler.bireyselAliciGiris.GirisActivity
import com.google.firebase.auth.FirebaseAuth

class PsifirlamaActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPsifirlamaBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding=ActivityPsifirlamaBinding.inflate(layoutInflater)

        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()
        binding.psifirlamabutton.setOnClickListener {
            val psifirlaemail=binding.psifirleamail.text.toString().trim()
            if(TextUtils.isEmpty(psifirlaemail)){
                binding.psifirleamail.error="Lütfen e-mail adresinizi yazınız"
            }else{
                auth.sendPasswordResetEmail(psifirlaemail)
                    .addOnCompleteListener {sifirlama->
                    if (sifirlama.isSuccessful){
                        binding.psifirlamesaj.text="E-mail adresinize sıfırlama bağlatısı gönderildi"
                    }else{
                        binding.psifirlamesaj.text="Sıfırlama başarısız"
                    }

                    }
            }
        }
        binding.psifirlamagirisyapbutton.setOnClickListener {
            val intent = Intent(applicationContext, GirisActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
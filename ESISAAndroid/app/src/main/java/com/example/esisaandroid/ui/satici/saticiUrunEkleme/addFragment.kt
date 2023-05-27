package com.example.esisaandroid.ui.satici.saticiUrunEkleme



import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.esisaandroid.databinding.FragmentAddBinding
import com.google.firebase.database.FirebaseDatabase


class addFragment : Fragment() {
    private lateinit var binding : FragmentAddBinding





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater , container, false)
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
                var database=FirebaseDatabase.getInstance()
                var databaseReferance=database.reference.child("Products")
                var id=databaseReferance.push()
                id.child("id").setValue(id.key.toString())
                id.child("isim").setValue(etname)
                id.child("fiyat").setValue(etprice)
                id.child("aciklama").setValue(etdesc)
                Toast.makeText(activity,"Ürün eklendi",Toast.LENGTH_LONG).show()
            }
        }








        return binding.root


    }


}
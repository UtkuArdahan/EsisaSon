package com.example.esisaandroid.ui.bireyselAlici.bireyselAliciHesabim

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.esisaandroid.databinding.FragmentBireyselAliciHesabimBinding
import com.example.esisaandroid.ui.bireyselAlici.bireyselAliciDestek.BireyselAliciDestekActivity
import com.example.esisaandroid.ui.girisler.bireyselAliciGiris.GirisActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BireyselAliciHesabimFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BireyselAliciHesabimFragment : Fragment() {
    private var _binding : FragmentBireyselAliciHesabimBinding? = null
    private  val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private var databaseReference: DatabaseReference?=null
    private var database: FirebaseDatabase?=null
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBireyselAliciHesabimBinding.inflate(inflater, container, false)
        val view = binding.root
        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("profile")
        var currentUser=auth.currentUser
        binding.bireyseladsoyadtxtsatici.text= ""+currentUser?.email
        binding.kategoriayakkabi.setOnClickListener {
            Toast.makeText(activity,"Henüz sipariş vermediniz", Toast.LENGTH_SHORT).show()
        }
        binding.kategoribilgisayar.setOnClickListener {
            Toast.makeText(activity,"Favorileriniz bulunmamakta", Toast.LENGTH_SHORT).show()
        }
        binding.kategorioyuncak.setOnClickListener {
            Toast.makeText(activity,"Bir ürünü puanlamadınız", Toast.LENGTH_SHORT).show()
        }
        binding.kategorikozmetik.setOnClickListener {
            Toast.makeText(activity,"Projemiz inşa aşamasında:(", Toast.LENGTH_SHORT).show()
        }
        binding.bireyseladreslerbuton.setOnClickListener {
            Toast.makeText(activity,"Adreslerinizi ödeme ekranında girebilirsiniz", Toast.LENGTH_SHORT).show()
        }
        binding.bireyselurunkarsbuton.setOnClickListener {
            Toast.makeText(activity,"Yakında bu özelliğimiz aktif olacak", Toast.LENGTH_SHORT).show()
        }
        binding.bireyseldestekbuton.setOnClickListener {
            val intent= Intent(activity, BireyselAliciDestekActivity::class.java)
            startActivity(intent)
           // finish()
        }
        binding.kategoribeyazesya.setOnClickListener {
            auth.signOut()
            val cikisintent= Intent(activity, GirisActivity::class.java)
            startActivity(cikisintent)
            //finish()
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BireyselAliciHesabimFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BireyselAliciHesabimFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
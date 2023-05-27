package com.example.esisaandroid.ui.bireyselAlici.bireyselAliciKategoriler

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.FragmentBireyselAliciHesabimBinding
import com.example.esisaandroid.databinding.FragmentBireyselAliciKategorilerBinding
import com.example.esisaandroid.databinding.FragmentKurumsalAliciKategorilerBinding
import com.example.esisaandroid.ui.bireyselAlici.*
import com.example.esisaandroid.ui.bireyselAlici.bireyselaliciayakkabisayfasi.BireyselAliciAyakkabiActivity
import com.example.esisaandroid.ui.bireyselAlici.bireyselalicibilgisayarsayfasi.BireyselAliciBilgisayarActivity
import com.example.esisaandroid.ui.bireyselAlici.bireyselalicimodasayfasi.BireyselAliciModaMainActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BireyselAliciKategorilerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BireyselAliciKategorilerFragment : Fragment() {
    private  var _binding:FragmentBireyselAliciKategorilerBinding?=null
    private  val binding get() = _binding!!
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
        _binding = FragmentBireyselAliciKategorilerBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.kategoriayakkabi.setOnClickListener {
            val intent=Intent(activity,BireyselAliciAyakkabiActivity::class.java)
            startActivity(intent)
        }
        binding.kategoribeyazesya.setOnClickListener {
            val intent=Intent(activity,BeyazesyaBireyselActivity::class.java)
            startActivity(intent)
        }
        binding.kategoribilgisayar.setOnClickListener {
            val intent=Intent(activity,BireyselAliciBilgisayarActivity::class.java)
            startActivity(intent)
        }
        binding.kategorikitap.setOnClickListener {
            val intent=Intent(activity,KitapBİreyselActivity::class.java)
            startActivity(intent)
        }
        binding.kategorimoda.setOnClickListener {
            val intent=Intent(activity,BireyselAliciModaMainActivity::class.java)
            startActivity(intent)
        }
        binding.kategorikozmetik.setOnClickListener {
            val intent=Intent(activity,KozmetikBireyselActivity::class.java)
            startActivity(intent)
        }
        binding.kategorioyuncak.setOnClickListener {
            val intent=Intent(activity,OyuncakBireyselActivity::class.java)
            startActivity(intent)
        }
        binding.kategoritelefon.setOnClickListener {
            val intent=Intent(activity,TelefonBireyselActivity::class.java)
            startActivity(intent)
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
         * @return A new instance of fragment BireyselAliciKategorilerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BireyselAliciKategorilerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
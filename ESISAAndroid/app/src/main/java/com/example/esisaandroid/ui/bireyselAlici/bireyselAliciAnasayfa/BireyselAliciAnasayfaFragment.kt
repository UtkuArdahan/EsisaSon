package com.example.esisaandroid.ui.bireyselAlici.bireyselAliciAnasayfa

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.FragmentBireyselAliciAnasayfaBinding
import com.example.esisaandroid.ui.kurumsalAlici.detaylar.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BireyselAliciAnasayfaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BireyselAliciAnasayfaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentBireyselAliciAnasayfaBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
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
        _binding = FragmentBireyselAliciAnasayfaBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.kartResim.setOnClickListener {
            val intent= Intent(activity, SamsungBudsActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim1.setOnClickListener {
            val intent= Intent(activity, ZweigActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim2.setOnClickListener {
            val intent= Intent(activity, CalvinKleinActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim3.setOnClickListener {
            val intent= Intent(activity, AsusRogActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim4.setOnClickListener {
            val intent= Intent(activity, DefactoCocukActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim5.setOnClickListener {
            val intent= Intent(activity, DeriKadinActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim6.setOnClickListener {
            val intent= Intent(activity, AppWatchActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim7.setOnClickListener {
            val intent= Intent(activity, GsActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim8.setOnClickListener {
            val intent= Intent(activity, Iphone11Activity::class.java)
            startActivity(intent)
        }
        binding.kartResim9.setOnClickListener {
            val intent= Intent(activity, GapActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim10.setOnClickListener {
            val intent= Intent(activity, AltusAlkActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim11.setOnClickListener {
            val intent= Intent(activity, NikeActivity::class.java)
            startActivity(intent)
        }
        binding.kartResim12.setOnClickListener {
            val intent= Intent(activity, PS5Activity::class.java)
            startActivity(intent)
        }
        binding.kartResim13.setOnClickListener {
            val intent= Intent(activity, PumaActivity::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button4.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button5.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button6.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button7.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button8.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button9.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button10.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button11.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button12.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button13.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button14.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button15.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
        }
        binding.button16.setOnClickListener {
            Toast.makeText(activity,"Ürün sepetinize eklendi",Toast.LENGTH_LONG).show()
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
         * @return A new instance of fragment BireyselAliciAnasayfaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BireyselAliciAnasayfaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
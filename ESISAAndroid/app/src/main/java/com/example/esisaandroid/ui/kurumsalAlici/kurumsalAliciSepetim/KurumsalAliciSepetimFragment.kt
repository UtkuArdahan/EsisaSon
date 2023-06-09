package com.example.esisaandroid.ui.kurumsalAlici.kurumsalAliciSepetim

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.esisaandroid.R
import com.example.esisaandroid.databinding.FragmentBireyselAliciSepetimBinding
import com.example.esisaandroid.databinding.FragmentKurumsalAliciSepetimBinding
import com.example.esisaandroid.ui.bireyselAlici.bireyselAliciSiparisEkrani.SiparisekraniActivity
import com.example.esisaandroid.ui.kurumsalAlici.kurumsalAliciSiparisEkrani.KurumsalAliciSiparisEkraniActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [KurumsalAliciSepetimFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class KurumsalAliciSepetimFragment : Fragment() {
    private var _binding: FragmentKurumsalAliciSepetimBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
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
        _binding = FragmentKurumsalAliciSepetimBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.btnCartCheckout.setOnClickListener {
            val intent= Intent(activity, KurumsalAliciSiparisEkraniActivity::class.java)
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
         * @return A new instance of fragment KurumsalAliciSepetimFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            KurumsalAliciSepetimFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
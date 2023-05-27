package com.example.esisaandroid.ui.satici.saticianasayfa

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esisaandroid.R
import com.example.esisaandroid.adapter.CustomAdapter
import com.example.esisaandroid.databinding.FragmentHomeBinding
import com.example.esisaandroid.products.Products
import com.example.esisaandroid.ui.satici.saticiUrunEkleme.addFragment
import com.google.firebase.database.*


class homeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var dbref:DatabaseReference
    private lateinit var recyclerview:RecyclerView
    private lateinit var userArrayList: ArrayList<Products>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater , container, false)
        //recyclerview=binding.userList
       /* recyclerview.layoutManager=LinearLayoutManager(activity)
        recyclerview.setHasFixedSize(true)
        userArrayList= arrayListOf<Products>()
        getData()*/


        return binding.root


    }





    private fun getData() {
        dbref=FirebaseDatabase.getInstance().getReference("Prdoucts")
        dbref.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (productSnapshot in snapshot.children){
                        val product=productSnapshot.getValue(Products::class.java)
                        userArrayList.add(product!!)
                    }
                    recyclerview.adapter=CustomAdapter(userArrayList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }


}
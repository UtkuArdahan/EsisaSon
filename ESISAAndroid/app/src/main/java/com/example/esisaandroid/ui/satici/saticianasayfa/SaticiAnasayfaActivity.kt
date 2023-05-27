package com.example.esisaandroid.ui.satici.saticianasayfa


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esisaandroid.R
import com.example.esisaandroid.adapter.CustomAdapter
import com.example.esisaandroid.databinding.ActivitySaticiAnasayfaBinding
import com.example.esisaandroid.databinding.FragmentHomeBinding
import com.example.esisaandroid.products.Products
import com.example.esisaandroid.ui.kurumsalAlici.kurumsalAliciAnasayfa.KurumsalAliciAnasayfaFragment
import com.example.esisaandroid.ui.satici.saticiUrunEkleme.addFragment
import com.example.esisaandroid.ui.satici.saticidestek.SaticiDestekActivity
import com.example.esisaandroid.ui.satici.saticihesabim.SaticiHesabimFragment
import com.google.firebase.database.*


class SaticiAnasayfaActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySaticiAnasayfaBinding
    private lateinit var dbref: DatabaseReference
    private lateinit var recyclerview: RecyclerView
    private lateinit var userArrayList: ArrayList<Products>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding=ActivitySaticiAnasayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*recyclerview=binding.userList
        recyclerview.layoutManager= LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        userArrayList= arrayListOf<Products>()
        getData()*/

        replaceFragment(KurumsalAliciAnasayfaFragment())
        binding.bottomNavigationViewSatici.setOnItemReselectedListener {
            when(it.itemId){
                R.id.homeSatici->replaceFragment(addFragment())
                R.id.accountSatici->replaceFragment(SaticiHesabimFragment())
                else->{
                    replaceFragment(addFragment())
                }

            }
            true
        }

    }



    private fun replaceFragment(fragment: Fragment){
        val fragmentManager= supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout_satici,fragment)
        fragmentTransaction.commit()
    }
    /*private fun getData() {
        dbref= FirebaseDatabase.getInstance().getReference("Products")
        dbref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (productSnapshot in snapshot.children){
                        val product=productSnapshot.getValue(Products::class.java)
                        userArrayList.add(product!!)
                    }
                    recyclerview.adapter= CustomAdapter(userArrayList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })

    }*/
    fun listegit(view:View){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        val listegit=homeFragment()
        fragmentTransaction.replace(R.id.frame_layout_satici,listegit).commit()
    }}







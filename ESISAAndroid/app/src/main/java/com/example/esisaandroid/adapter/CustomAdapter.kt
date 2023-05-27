package com.example.esisaandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.esisaandroid.R
import com.example.esisaandroid.products.Products




class CustomAdapter(private val productList: ArrayList<Products>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
      val tvproductName:TextView=view.findViewById(R.id.tvproductName)
      val tvproductPrice:TextView=view.findViewById(R.id.tvProductPrice)
      val tvproductDesc:TextView=view.findViewById(R.id.tvProductDesc)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.user_item_list, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.tvproductName.text = productList[position].isim
        viewHolder.tvproductPrice.text = productList[position].fiyat.toString()
        viewHolder.tvproductDesc.text = productList[position].aciklama
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = productList.size

}
package com.example.storeapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsRecyclerAdapter (val context : Context, val products : List <Product>) : RecyclerView.Adapter<ProductsRecyclerAdapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]

        holder.nameTextView.text = product.productName
        holder.priceTextView.text = product.price.toString()
        holder.imageView.setImageResource(product.picture)
        holder.buyButton.isChecked = product.buy
        holder.buyPosition = position

    }

    override fun getItemCount() = products.size


    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        val nameTextView = itemView.findViewById<TextView>(R.id.nameView)
        val priceTextView = itemView.findViewById<TextView>(R.id.priceView)
        val buyButton = itemView.findViewById<CheckBox>(R.id.checkBox)
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        var buyPosition = 0

        init {
            buyButton.setOnClickListener {
                DataManager.products[buyPosition].buy = buyButton.isChecked
            }


        }

    }

}
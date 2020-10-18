package com.crusbel.examen.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.crusbel.examen.R
import com.crusbel.examen.model.Model
import com.crusbel.examen.recycler.RecyclerViewHolder
import java.util.*


class RvAdapter(val userList: ArrayList<Model>,val context: Context) : RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return R.layout.card_productos
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.viewnombre.text = userList[position].nombre
        holder.viewprecio.text = userList[position].precio.toString()
        holder.viewdescripcion.text = userList[position].descripcion
        Glide.with(context)
            .load(userList[position].imagen)
            .into(holder.viewimagen);
        holder.viewimagen.setOnClickListener {
            if (holder.boxDetalle.visibility == LinearLayout.VISIBLE){
                holder.boxDetalle.visibility = LinearLayout.INVISIBLE
            } else{
                holder.boxDetalle.visibility = LinearLayout.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    init {
    }
}
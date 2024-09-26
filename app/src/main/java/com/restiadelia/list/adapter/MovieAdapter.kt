package com.restiadelia.list.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.list.R
import com.restiadelia.list.DetailMovie
import com.restiadelia.list.Movie
import com.restiadelia.list.detailbuah
import com.restiadelia.list.model.ModelBuah
import com.restiadelia.list.model.ModelMovie

class MovieAdapter(  val itemList: ArrayList<ModelMovie>,
                     val getActivity: Movie
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgMovieItem : ImageView
        var txtMovieItem : TextView
        var txtSinopsisItem : TextView

        init {
            imgMovieItem = itemView.findViewById(R.id.imgMovieItem) as ImageView
            txtMovieItem = itemView.findViewById(R.id.txtMovieItem) as TextView
            txtSinopsisItem = itemView.findViewById(R.id.txtSinopsisItem) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_movie, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgMovieItem.setImageResource(itemList[position].gambar)
        holder.txtMovieItem.setText(itemList[position].judul)
        holder.txtSinopsisItem.setText(itemList[position].sinopsis)

        holder.itemView.setOnClickListener() {
            val intent = Intent(getActivity, DetailMovie::class.java)
            intent.putExtra("imgMovieItem", itemList[position].gambar)
            intent.putExtra("txtMovieItem", itemList[position].judul)
            intent.putExtra("txtSinopsisItem", itemList[position].sinopsis)
            getActivity.startActivity(intent)
        }

    }
}
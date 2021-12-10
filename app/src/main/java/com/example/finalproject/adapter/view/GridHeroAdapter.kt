package com.example.finalproject.adapter.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.finalproject.DetailActivity
import com.example.finalproject.R
import com.example.finalproject.data.Hero
import com.example.finalproject.data.OnItemClickCallback
import com.example.finalproject.databinding.ItemGridHeroBinding

class GridHeroAdapter(private val listHero: ArrayList<Hero>) :
    RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    class GridViewHolder(val binding: ItemGridHeroBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = GridViewHolder(
        ItemGridHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val hero = listHero[position]
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(hero.image)
                .apply(RequestOptions().override(350, 550))
                .into(imgItemHero)
            holder.itemView.setOnClickListener {
                val intent = Intent(it.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.HERO_DATA, listHero[position])
                it.context.startActivity(intent)

                Toast.makeText(
                    holder.itemView.context,
                    holder.itemView.context.getString(R.string.you_chose) + listHero[position].name,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }
}
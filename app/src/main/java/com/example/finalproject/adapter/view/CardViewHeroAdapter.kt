package com.example.finalproject.adapter.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.finalproject.DetailActivity
import com.example.finalproject.R
import com.example.finalproject.data.Hero
import com.example.finalproject.data.OnItemClickCallback
import com.example.finalproject.databinding.ItemCardViewBinding

class CardViewHeroAdapter(private val listHero: ArrayList<Hero>) :
    RecyclerView.Adapter<CardViewHeroAdapter.CardViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    class CardViewHolder(val binding: ItemCardViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CardViewHolder(
        ItemCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val hero = listHero[position]
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(hero.image)
                .apply(RequestOptions().override(350, 350))
                .into(imgHero)

            // Text
            tvNameHero.text = hero.name
            tvCategoryHero.text = hero.category

            holder.itemView.setOnClickListener {
                val intent = Intent(it.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.HERO_DATA, listHero[position])
                it.context.startActivity(intent)
            }

        }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }
}
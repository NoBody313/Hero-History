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
import com.example.finalproject.databinding.ItemListHeroBinding

class ListHeroAdapter(private val listHero: ArrayList<Hero>) :
    RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    class ListViewHolder(val binding: ItemListHeroBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ListViewHolder(
        ItemListHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]

        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(hero.image)
                .apply(RequestOptions().override(55, 55))
                .into(imgItemPhoto)

            tvNameHero.text = hero.name
            tvCategoryHero.text = hero.category
        }


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

    override fun getItemCount(): Int {
        return listHero.size
    }
}
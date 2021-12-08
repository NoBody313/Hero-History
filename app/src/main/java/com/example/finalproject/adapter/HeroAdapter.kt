package com.example.finalproject.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalproject.data.Hero
import com.example.finalproject.databinding.FragmentHomeBinding
import com.example.finalproject.databinding.RowItemHeroBinding

class HeroAdapter(private val listHero: ArrayList<Hero>) :
    RecyclerView.Adapter<HeroAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: RowItemHeroBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        RowItemHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listHero[position]) {
                tvNameHero.text = name
                tvYearHero.text = year
                tvCategoryHero.text = category
                Glide.with(imgHero.context).load(image).into(imgHero)
            }
        }
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, Det)
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
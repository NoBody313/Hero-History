package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.finalproject.data.Hero
import com.example.finalproject.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val HERO_DATA = "hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        setSupportActionBar(binding.root.tool)

        val dataHero = intent.getParcelableExtra<Hero>(HERO_DATA) as Hero

//        Glide.with(this).load(dataHero.image).into(binding.imgDetail)

        binding.apply {
            tvName
        }
    }
}
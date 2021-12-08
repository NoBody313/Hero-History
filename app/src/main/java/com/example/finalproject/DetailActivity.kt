package com.example.finalproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataHero = intent.getParcelableExtra<Hero>(HERO_DATA) as Hero

        Glide.with(this).load(dataHero.image).into(binding.imgDetail)

        binding.apply {
            tvTitleHero.text = dataHero.name
            tvYearNumber.text = dataHero.year
            tvHeroCategory.text = dataHero.category
            tvDescHero.text = dataHero.desc
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
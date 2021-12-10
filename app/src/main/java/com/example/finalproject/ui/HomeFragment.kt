package com.example.finalproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.adapter.view.CardViewHeroAdapter
import com.example.finalproject.adapter.view.GridHeroAdapter
import com.example.finalproject.adapter.view.ListHeroAdapter
import com.example.finalproject.data.Hero
import com.example.finalproject.data.HeroData
import com.example.finalproject.data.OnItemClickCallback
import com.example.finalproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.rvHome.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter = GridHeroAdapter(HeroData.listIndependenceHero)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Linear Layout
    fun showRecycleList() {
        binding.rvHome.layoutManager = LinearLayoutManager(context)
        val listHeroAdapter = ListHeroAdapter(HeroData.listIndependenceHero)
        binding.rvHome.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showRecycleList()
            }
        })
    }

    // Grid Layout
    fun showRecycleGrid() {
        binding.rvHome.layoutManager = GridLayoutManager(context, 2)
        val gridHeroAdapter = GridHeroAdapter(HeroData.listIndependenceHero)
        binding.rvHome.adapter = gridHeroAdapter

        gridHeroAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showRecycleGrid()
            }
        })
    }

    // CardView
    fun showRecycleCardView() {
        binding.rvHome.layoutManager = LinearLayoutManager(context)
        val cardViewHeroAdapter = CardViewHeroAdapter(HeroData.listIndependenceHero)
        binding.rvHome.adapter = cardViewHeroAdapter


        cardViewHeroAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showRecycleCardView()
            }
        })
    }
}
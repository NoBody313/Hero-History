package com.example.finalproject.ui

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.adapter.view.CardViewHeroAdapter
import com.example.finalproject.adapter.view.GridHeroAdapter
import com.example.finalproject.adapter.view.ListHeroAdapter
import com.example.finalproject.data.Hero
import com.example.finalproject.data.HeroData
import com.example.finalproject.data.OnItemClickCallback
import com.example.finalproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding as FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.rvHome.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(activity, 2)
            adapter = CardViewHeroAdapter(HeroData.listIndependenceHero)
        }

//        showRecycleCardView()
        return binding.root
    }

    // Option Menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_cardView -> showRecycleCardView()
            R.id.action_grid -> showRecycleGrid()
            R.id.action_list -> showRecycleList()
        }
    }

    // CardView
    fun showRecycleCardView() {
        binding.rvHome.layoutManager = LinearLayoutManager(context)
        val cardViewHeroAdapter = CardViewHeroAdapter(HeroData.listIndependenceHero)
        binding.rvHome.adapter = cardViewHeroAdapter

        binding.rvHome.apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = CardViewHeroAdapter(HeroData.listIndependenceHero)
        }


        cardViewHeroAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showRecycleCardView()
            }
        })
    }

    // Linear Layout
    fun showRecycleList() {
        binding.rvHome.layoutManager = LinearLayoutManager(context)
        val listHeroAdapter = ListHeroAdapter(HeroData.listIndependenceHero)
        binding.rvHome.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                Toast.makeText(context, data.name, Toast.LENGTH_SHORT).show()
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
//                showRecycleGrid()
            }
        })
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.adapter.view.CardViewHeroAdapter
import com.example.finalproject.adapter.view.GridHeroAdapter
import com.example.finalproject.adapter.view.ListHeroAdapter
import com.example.finalproject.data.Hero
import com.example.finalproject.data.HeroData
import com.example.finalproject.data.OnItemClickCallback
import com.example.finalproject.databinding.ActivityMainBinding
import com.example.finalproject.ui.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    // Mode
    private var list: ArrayList<Hero> = arrayListOf()
    private var title: String = "Mode List"

    // Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        // Sec Act Bar
        setActionBarTitle(title)

        list.addAll(HeroData.listIndependenceHero)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.exploreFragment,
                R.id.profileFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    // Option Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_grid -> HomeFragment().showRecycleGrid()
            R.id.action_cardView -> HomeFragment().showRecycleCardView()
            R.id.action_list -> HomeFragment().showRecycleList()
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}
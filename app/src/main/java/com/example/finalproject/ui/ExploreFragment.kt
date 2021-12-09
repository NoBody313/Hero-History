package com.example.finalproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.finalproject.adapter.HeroAdapter
import com.example.finalproject.data.HeroData
import com.example.finalproject.databinding.FragmentExploreBinding
import com.example.finalproject.databinding.FragmentExploreBinding.inflate

class ExploreFragment : Fragment() {

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvExplore.apply {
            layoutManager = GridLayoutManager(activity, 3)
            adapter = HeroAdapter(HeroData.listEducationHero)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
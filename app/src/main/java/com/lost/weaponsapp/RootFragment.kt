package com.lost.weaponsapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.lost.weaponsapp.databinding.FragmentRootBinding

class RootFragment: Fragment(R.layout.fragment_root) {

    private lateinit var binding:FragmentRootBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)

        binding.openGreen.setOnClickListener {
            openBox(Color.rgb(255,255,200))
        }
        binding.openYellow.setOnClickListener {
            openBox(Color.rgb(200,255,200))
        }
    }

    private fun openBox(color:Int){
        findNavController().navigate(R.id.action_rootFragment_to_boxFragment,
        bundleOf(BoxFragment.ARG_COLOR to color)
        )
    }

}
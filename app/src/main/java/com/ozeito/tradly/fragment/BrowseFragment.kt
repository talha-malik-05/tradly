package com.ozeito.tradly.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozeito.tradly.R
import com.ozeito.tradly.databinding.FragmentBrowseBinding

class BrowseFragment : Fragment() {

    private lateinit var binding: FragmentBrowseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBrowseBinding.inflate(inflater,container,false)
        return binding.root
    }

}
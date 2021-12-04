package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels


import com.example.fragments.databinding.FragmentFirstFragmaentBinding


class FirstFragmaent : Fragment() {

   private val viewModel: ViewModel by viewModels()
    private var _binding: FragmentFirstFragmaentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first_fragmaent, container, false)
        return _binding?.root
         }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.button.setOnClickListener {
            viewModel.printViewModel()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null         }
}



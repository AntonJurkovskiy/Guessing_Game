package com.azimut4946777.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azimut4946777.guessinggame.databinding.FragmentGameBinding
import com.azimut4946777.guessinggame.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
 private var _binding: FragmentResultBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentResultBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
package com.anggapamb.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.anggapamb.navigationcomponent.databinding.ActivityMainBinding
import com.anggapamb.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.btnMoveSetting.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_setting))


        return binding.root
    }
}

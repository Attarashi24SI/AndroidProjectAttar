package com.example.attarp12siaapps.Home

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.attarp12siaapps.Home.Pertemuan_10.TenthActivity
import com.example.attarp12siaapps.Home.Pertemuan_2.SecondActivity
import com.example.attarp12siaapps.Home.Pertemuan_7.SeventhActivity
import com.example.attarp12siaapps.Home.Pertemuan_9.NinthActivity
import com.example.attarp12siaapps.Home.pertemuan_3.ThirdActivity
import com.example.attarp12siaapps.Home.pertemuan_4.FourthActivity
import com.example.attarp12siaapps.Home.pertemuan_5.activity_fifth
import com.example.attarp12siaapps.R
import com.example.attarp12siaapps.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        // SharedPreferences
        val sharedPref =
            requireContext().getSharedPreferences("user_pref", MODE_PRIVATE)

        // Window Insets
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        // Button Pertemuan 2
        binding.btnToP2.setOnClickListener {

            val intent = Intent(requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }

        // Button Pertemuan 3
        binding.btnToP3.setOnClickListener {

            val intent = Intent(requireContext(), ThirdActivity::class.java)
            startActivity(intent)
        }

        // Button Pertemuan 4
        binding.btnToP4.setOnClickListener {

            val intent = Intent(requireContext(), FourthActivity::class.java)

            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)

            startActivity(intent)
        }

        // Button Pertemuan 5
        binding.btnToP5.setOnClickListener {

            val intent = Intent(requireContext(), activity_fifth::class.java)

            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)

            startActivity(intent)
        }

        // Button Pertemuan 7
        binding.btnToP7.setOnClickListener {

            val intent = Intent(requireContext(), SeventhActivity::class.java)
            startActivity(intent)
        }

        // Button Pertemuan 7
        binding.btnToP9.setOnClickListener {

            val intent = Intent(requireContext(), NinthActivity::class.java)
            startActivity(intent)
        }

        // Button Pertemuan 4
        binding.btnToP10.setOnClickListener {

            val intent = Intent(requireContext(), TenthActivity::class.java)

            startActivity(intent)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
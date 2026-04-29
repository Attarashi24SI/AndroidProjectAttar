package com.example.attarp12siaapps.Home

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.attarp12siaapps.Home.Pertemuan_2.SecondActivity
import com.example.attarp12siaapps.Home.Pertemuan_7.SeventhActivity
import com.example.attarp12siaapps.Home.pertemuan_3.ThirdActivity
import com.example.attarp12siaapps.Home.pertemuan_4.FourthActivity
import com.example.attarp12siaapps.Home.pertemuan_5.activity_fifth
import com.example.attarp12siaapps.R
import com.example.attarp12siaapps.databinding.ActivityMainBinding
import com.example.attarp12siaapps.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    class HomeFragment : Fragment() {
        private var _binding: FragmentHomeBinding? = null
        private val binding get() = _binding!!

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
//            binding = ActivityMainBinding.inflate(layoutInflater)
//            setContentView(binding.root)

            //Kode ini harus selalu dipanggil saat butuh akses "user_pref"
            val sharedPref = requireContext().getSharedPreferences("user_pref", MODE_PRIVATE)

//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }


            binding.btnToP2.setOnClickListener {

                val intent = Intent(requireContext(re, SecondActivity::class.java))
                startActivity(intent)



                startActivity(intent)
            }

            binding.btnToP3.setOnClickListener {

                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)



                startActivity(intent)
            }

            binding.btnToP4.setOnClickListener {

                val intent = Intent(this, FourthActivity::class.java)
                startActivity(intent)

                /*tambahkan bagian berikut*/
                intent.putExtra("name", "Politeknik Caltex Riau")
                intent.putExtra("from", "Rumbai")
                intent.putExtra("age", 25)

                startActivity(intent)
            }

            binding.btnToP5.setOnClickListener {

                val intent = Intent(this, activity_fifth::class.java)
                startActivity(intent)

                /*tambahkan bagian berikut*/
                intent.putExtra("name", "Politeknik Caltex Riau")
                intent.putExtra("from", "Rumbai")
                intent.putExtra("age", 25)

                startActivity(intent)
            }

            binding.btnToP7.setOnClickListener {

                val intent = Intent(this, SeventhActivity::class.java)


                /*tambahkan bagian berikut*/
//            intent.putExtra("name", "Politeknik Caltex Riau")
//            intent.putExtra("from", "Rumbai")
//            intent.putExtra("age", 25)

                startActivity(intent)
            }

    }
}
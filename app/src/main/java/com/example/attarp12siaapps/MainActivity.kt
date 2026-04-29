package com.example.attarp12siaapps

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.attarp12siaapps.Home.Pertemuan_2.SecondActivity
import com.example.attarp12siaapps.Home.Pertemuan_7.SeventhActivity
import com.example.attarp12siaapps.databinding.ActivityMainBinding
import com.example.attarp12siaapps.Home.pertemuan_3.ThirdActivity
import com.example.attarp12siaapps.Home.pertemuan_4.FourthActivity
import com.example.attarp12siaapps.Home.pertemuan_5.activity_fifth
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Kode ini harus selalu dipanggil saat butuh akses "user_pref"
        val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

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

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

            /*tambahkan bagian berikut*/
            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)

            startActivity(intent)
        }

        binding.btnToP3.setOnClickListener {

            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

            /*tambahkan bagian berikut*/
            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)

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



        binding.btnLogout.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Konfirmasi")
                .setMessage("Apakah Anda yakin ingin Logout?")
                .setPositiveButton("Ya") { dialog, _ ->
                    dialog.dismiss()

                    val editor = sharedPref.edit()
                    editor.clear()
                    editor.apply()

                    dialog.dismiss()

                    val intent = Intent(this, AuthActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                .setNegativeButton("Batal") { dialog, _ ->
                    dialog.dismiss()
                    Log.e("Info Dialog","Anda memilih Tidak!")
                }
                .show()
        }
    }
}
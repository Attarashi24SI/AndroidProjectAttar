package com.example.attarp12siaapps.Pertemuan_2

import android.R

fun main(){
    println("hasi rekan-rekan...")
    println("selamat datang di bahasa pemrograman kotlin")

    println("==================")

    var angka = 15
    println("hasil dari 15 + 10 = ${angka + 10}")

    val nilaiInt = 10000
    val nilaiDouble = 100.003
    val nilaiFloat = 1000.0f

    println("nilai Integer = $nilaiInt")
    println("nilai Double = $nilaiDouble")
    println("nilai Float = $nilaiFloat")

    println("=======STRING=======")
    val huruf = 'a'
    println("ini penggunaan karakter '$huruf'")

    val nilaiString = "Mawar"
    println("Halo $nilaiString! \n apa Kabar?")

    println("==========KONDISI==========")

    val nilai = 10
    if (nilai<0)
        println("bilangan negatif")
    else {
        if (nilai%2 == 0)
            println("bilangan genap")
        else
            println("bilangan ganjil")
    }

    println("=========perulangan=========")

    val kampusKu: Array<String> = arrayOf("kampus","Politeknik","Caltex","Riau")
    for (kampus: String in kampusKu){
        println(kampus)
    }




}
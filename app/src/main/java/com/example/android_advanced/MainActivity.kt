package com.example.android_advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.sql.RowId

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<gambar>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.danau_toba,
            R.drawable.gunung_rinjani,
            R.drawable.kepulauan_derawan,
            R.drawable.nusa_dua_bali,
            R.drawable.nusa_penida,
            R.drawable.pantai_parai_tenggiri,
            R.drawable.pura_besakih,
            R.drawable.taman_laut_bunaken,
            R.drawable.taman_nasional_way_kambas
        )

        heading = arrayOf(
            "Danau dengan keindahan yang tidak tertandingi ini merupakan danau vulkanik terbesar di Asia Tenggara dan terbesar kedua di dunia setelah Danau Victoria",
            "Gunung ini adalah gunung berapi tertinggi kedua yang ada di Indonesia.",
            "Kepulauan Derawan adalah sebuah kepulauan yang berada di Kabupaten Berau, Kalimantan Timur.",
            "Objek wisata pantai ini memiliki pasir putih yang lembut dan air laut yang berwarna biru jernih.",
            "Pulau Bali, sudah tidak bisa dipungkiri lagi namanya memang merajalela ke seluruh dunia karena pemandangannya yang indah, budayanya yang masih kental terasa dan pantai nya yang eksotis.",
            "Parai Tenggiri memiliki struktur pantai yang landai dengan air laut berwarna hijau toska serta pasir putihnya yang lembut.",
            "Pulau ini terletak di Desa Besakih, Kecamatan Rendang, berada di lereng sebelah barat daya Gunung Agung, gunung tertinggi di Bali.",
            "Taman Nasional Way Kambas (TNKW) Lampung ditetapkan sebagai kawasan Taman Warisan ASEAN (ASEAN Heritage Park) yang ke-36, pada tanggal 25 Juli 2016.",
        )

        newRecyclerView =findViewById(R.id.pilihan)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<gambar>()
        getUserdata()

    }

    private fun getUserdata() {

        for(i in imageId.indices){

            val gambar = gambar(imageId[i],heading[i])
            newArrayList.add(gambar)
        }
        newRecyclerView.adapter = Adapter(newArrayList)
    }

}
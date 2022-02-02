package com.peradaban.uasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listMahasiswa = listOf(
            MahasiswaModel(
                R.drawable.ainul,
                "M. Ainul Rokhman",
                "42418047",
                "Informatika",
                "Saya kelas karyawan semester 7 dan saya tinggal di desa taraban"
            ),
            MahasiswaModel(
                R.mipmap.ic_launcher,
                "Faidatun Nisa",
                "42418035",
                "Informatika",
                "Saya kelas karyawan semester 7 dan saya tinggal di Bumiayu"
            ),
        )

        val recycler: RecyclerView = findViewById(R.id.recycler)
        val customAdapter = CustomAdapter(listMahasiswa)
        recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = customAdapter
        }
    }
}
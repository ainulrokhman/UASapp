package com.peradaban.uasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView

class DetailMahasiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_mahasiswa)

        val mahasiswa = intent.getParcelableExtra<MahasiswaModel>("dataMhs")

        val ciFoto: CircleImageView = findViewById(R.id.ciFoto)
        val tvNama: TextView = findViewById(R.id.tvNama)
        val tvNim: TextView = findViewById(R.id.tvNim)
        val tvProdi: TextView = findViewById(R.id.tvProdi)
        val tvTentang: TextView = findViewById(R.id.tvTentang)

        ciFoto.setImageResource(mahasiswa!!.foto)
        tvNama.text = mahasiswa.nama
        tvNim.text = mahasiswa.nim
        tvProdi.text = mahasiswa.prodi
        tvTentang.text = mahasiswa.tentang
    }
}
package com.peradaban.uasapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CustomAdapter(private val listMahasiswa: List<MahasiswaModel>):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvNama: TextView = view.findViewById(R.id.tvNama)
        val tvProdi: TextView = view.findViewById(R.id.tvProdi)
        val tvNim: TextView = view.findViewById(R.id.tvNim)
        val cImage: CircleImageView = view.findViewById(R.id.icFoto)
        val layout: LinearLayout = view.findViewById(R.id.layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.cImage.setImageResource(listMahasiswa[position].foto)
        holder.tvNama.text = listMahasiswa[position].nama
        holder.tvProdi.text = listMahasiswa[position].prodi
        holder.tvNim.text = listMahasiswa[position].nim
        holder.layout.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailMahasiswa::class.java)
            intent.putExtra("dataMhs", listMahasiswa[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listMahasiswa.size
}
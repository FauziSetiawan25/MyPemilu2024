package com.example.mypemilu2024

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypemilu2024.databinding.ItemCalonBinding

class CalonAdapter(private val ListCalon: List<Calon>):RecyclerView.Adapter<CalonAdapter.ItemCalonViewHolder>() {
    inner class ItemCalonViewHolder(private val binding: ItemCalonBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Calon) {
            with(binding) {
                nomor.setImageResource(data.nomor)
                capres.setImageResource(data.capres)
                cawapres.setImageResource(data.cawapres)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemCalonViewHolder {
        val binding = ItemCalonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemCalonViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return ListCalon.size
    }

    override fun onBindViewHolder(holder: ItemCalonViewHolder, position: Int) {
        holder.bind(ListCalon[position])
    }
}
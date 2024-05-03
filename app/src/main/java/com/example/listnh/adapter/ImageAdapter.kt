package com.example.listnh.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.listnh.R
import com.example.listnh.databinding.ImageItemBinding
import com.example.listnh.model.ImageModel


class ImageAdapter(private val imageModel: List<ImageModel>) :
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ImageViewHolder(view)
    }


    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.binding.apply {
            image1.load(imageModel[position].imageUrl)
        }
    }

    override fun getItemCount() = imageModel.size


    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ImageItemBinding.bind(itemView)
    }
}
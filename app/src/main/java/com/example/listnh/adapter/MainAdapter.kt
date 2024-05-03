package com.example.listnh.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listnh.R
import com.example.listnh.databinding.ParentItemBinding
import com.example.listnh.model.MainModel

class MainAdapter(private val collection: List<MainModel>) :
    RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
      val view =LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun getItemCount() = collection.size

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
       holder.binding.apply {
           val collection = collection [position]
           val imageAdapter = ImageAdapter(collection.imageModel)
           rvimage.adapter=imageAdapter
       }
    }


    inner class CollectionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
               val binding = ParentItemBinding.bind(itemView)
    }
}

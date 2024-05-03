package com.example.listnh.utils

import com.example.listnh.model.ImageModel
import com.example.listnh.model.MainModel

object SampleData {

    private val ImageModel = listOf(
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
        ImageModel(Images.imageUrl0),
    )
val collection = listOf(
    MainModel("All Image" , ImageModel),
    MainModel("Want to see" , ImageModel.reversed()),
    MainModel("Anime" , ImageModel.shuffled()),
    MainModel("Top Rated Image" , ImageModel),
)

}
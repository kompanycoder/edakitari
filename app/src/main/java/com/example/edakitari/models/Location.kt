package com.example.edakitari.models

data class Location(
    val location_id: Int,
    val location_name: String,
//    val location_coordinates: Array<T>,
    val owner_id: Int,
)

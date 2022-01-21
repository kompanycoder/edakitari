package com.example.edakitari.models

data class Prescription(
    val prescription_id: Int,
    val prescription_name: String,
    val prescription_type: String,
    val prescription_subscribers_count: Int,
//    val prescription_subscribers: Array<Object>,
)

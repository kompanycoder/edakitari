package com.example.edakitari.models

data class EmergencyService(
    val emergency_id: Int,
    val emergency_code: String,
    val emergency_name: String,
    val emergency_subscribers_count: Int,
    val emergency_subscribers_array: Array<Object>,
)
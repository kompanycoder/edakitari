package com.example.edakitari.models

import java.util.*

data class Appointment(
    val appointment_id: Int,
    val appointment_name: String,
    val appointment_type: String,
    val appointment_date: Date,
    val user_id: Int,
)

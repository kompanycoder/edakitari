package com.example.edakitari.models

import com.example.edakitari.database.Hospital
import java.util.*

data class User(
    val id: Int,
    val name: String,
    val dob: Date,
    val email: String,
    val password: String,
    val phone_number: String,
    val date_joined: Date,
    val city: String,
    val province: String,
    val country: String,
    val user_avatar: String,
    val account_verified: Boolean,
    val account_active: Boolean,
    val quarantine_status: Boolean,


    // nullable arrays
    val services_subscribed: Array<Service>,
    val doctor_appointments: Array<Appointment>,
    val location_array: Array<Location>,
    val articles_read: Array<Article>,
    val hospital_array: Array<Hospital>,
    val diagnosis_array: Array<Diagnosis>,
    val podcast_array: Array<Podcast>,
    val transaction_array: Array<Transaction>,
    val prescription_array: Array<Prescription>,
    val emergency_services_array: Array<EmergencyService>,
)
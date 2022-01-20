package com.example.edakitari.models

import java.util.*

data class User(
    val id: Int,
    val name: String,
    val dob: Date,
    val email: String,
    val password: String,
    val date_joined: Date,
    val country: String,
    val photo: String,
    val account_active: Boolean,
    val phone_number: String,
    val city: String,
    // nullable arrays
    val services_subscribed: Array<Service>,
    val doctor_appointments: Array<Appointment>,
//        val location_array: Array<T>,
//    val articles_liked: Array<T>,
//    val hospital_array: Array<T>,
//    val diagnosis_array: Array<T>,
//    val podcast_array: Array<T>,
    val transaction_array: Array<Transaction>,
    val prescription_array: Array<Prescription>,
    val emergency_services_array: Array<EmergencyService>,
)
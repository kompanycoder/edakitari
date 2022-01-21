package com.example.edakitari.models

data class Diagnosis(
    val diagnosis_id: Int,
    val diagnosis_name: String,
    val diagnosis_type: String,
    val diagnosis_subscribers_count: Int,
    val diagnosis_subscribers: Array<Object>,
)

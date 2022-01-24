package com.example.edakitari.models

data class Diagnosis(
    val diagnosis_id: Int,
    val diagnosis_name: String,
    val diagnosis_type: String,
    val diagnosis_severity: String,
    val requires_quarantine: Boolean,
    val requires_follow_up: Boolean,
    val diagnosis_subscribers_count: Int,
    val diagnosis_subscribers: Array<User>,
)

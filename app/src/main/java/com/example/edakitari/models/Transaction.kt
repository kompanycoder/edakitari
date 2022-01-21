package com.example.edakitari.models

data class Transaction(
    val transaction_id: Int,
    val transaction_name: String,
    val transaction_type: String,
    val transaction_status: String,
)

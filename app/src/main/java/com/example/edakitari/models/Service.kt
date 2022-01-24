package com.example.edakitari.models

import java.util.*

data class Service (
 val service_id: Int,
 val service_name: String,
 val service_description: String,
 val service_subscribers: Int,
 val subscriber_array: Array<User>,
 val service_active: Boolean,
 val service_duration: Date,
)
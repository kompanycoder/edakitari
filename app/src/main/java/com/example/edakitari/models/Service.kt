package com.example.edakitari.models

data class Service (
 val service_id: Int,
 val service_name: String,
 val service_subscribers: Int,
 val subscriber_array: Array<Object>,
 val service_active: Boolean,
)
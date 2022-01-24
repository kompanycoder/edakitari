package com.example.edakitari.models

data class Podcast(
    val podcast_id: Int,
    val podcast_name: String,
    val podcast_category: String,
    val podcast_length: String,
    val podcast_subscribers: Array<User>,
    val podcast_articles: Array<Article>,
    val podcast_status: Boolean,
)

package com.example.edakitari.models

data class Article(
    val article_id: Int,
    val article_name: String,
    val article_reader_count: Int,
    val article_category: String,
    val article_subscribers: Array<User>,
    val articles_related: Array<Article>,
    val article_source: String,
)
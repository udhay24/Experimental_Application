package com.udhay.demolibrary.model

internal data class FrameInfo(
    val gender: String,
    val category: String,
    val product_id: String,
    val brand: String,
    val marketplace: String,
    val img_url: String,
    val score: String,
    val image_prepared: Boolean,
    val primary_color: String,
    val triad1_color: String,
    val triad2_color: String,
    val product_url: String
)
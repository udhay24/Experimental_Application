package tech.posit.android.data.repository.model

internal data class ProductInfo(
    val gender: String,
    val category: String,
    val product_id: String,
    val brand: String,
    val marketplace: String,
    val img_url: String,
    val score: String,
    val image_prepared: Boolean,
    val primary_color: String,
    val is_bright: Boolean,
    val product_url: String
)
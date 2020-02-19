package tech.posit.android.data.repository.model

internal data class VideoInfo(
    val product_info: List<ProductInfo>,
    val product_list: List<ProductAppearance>,
    val video_id: String
)
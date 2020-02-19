package com.udhay.demolibrary.model

internal data class Video(
    val video_id: String,
    val client_video_id: String,

    val running_time: Long,

    val language: String,
    val genre: String,
    val mpd_source: String,

    val is_shoppable: Boolean,
    val is_series: Boolean,

    val enable_indexing: Boolean,
    val total_index_seed: Int,
    val index_rate: Int
)
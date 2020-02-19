package tech.posit.android.data.repository.model

internal data class Session(
    val pk: String,
    val sk: String,
    val user_id: String,
    val session_id: String,
    val client_id: String,
    val client_access_key: String,
    val active_status: Boolean
)
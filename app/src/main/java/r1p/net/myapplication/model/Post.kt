package r1p.net.myapplication.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//BUSINESS LOGIC AND DATA

@JsonClass(generateAdapter = true)
data class Post(
    @Json(name = "userId") val userId: Int,
    @Json(name = "id") val id: Int,
    @Json(name = "title") val title: String,
    @Json(name = "body") val body: String
)
package com.example.newsforyou.response


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("category")
    val category: List<String>,
    @SerializedName("content")
    val content: String,
    @SerializedName("country")
    val country: List<String>,
    @SerializedName("creator")
    val creator: List<String>,
    @SerializedName("description")
    val description: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("keywords")
    val keywords: List<String>,
    @SerializedName("language")
    val language: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("pubDate")
    val pubDate: String,
    @SerializedName("source_id")
    val sourceId: String,
    @SerializedName("source_priority")
    val sourcePriority: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("video_url")
    val videoUrl: Any
)
package com.example.newsforyou.response


import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("nextPage")
    val nextPage: String,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)
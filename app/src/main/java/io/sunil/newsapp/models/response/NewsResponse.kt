package io.sunil.newsapp.models.response


import com.google.gson.annotations.SerializedName
import io.sunil.newsapp.models.entity.Article

data class NewsResponse(
    @SerializedName("articles")
    val articles: MutableList<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)
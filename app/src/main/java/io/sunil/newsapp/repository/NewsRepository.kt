package io.sunil.newsapp.repository

import io.sunil.newsapp.db.ArticleDatabase
import io.sunil.newsapp.models.entity.Article
import io.sunil.newsapp.network.RetrofitInstance

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(pageNumber = pageNumber)

    suspend fun searchNews(searchQuery:String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery=searchQuery, pageNumber = pageNumber)

    suspend fun upsert(article: Article) =
        db.getArticleDao().upsert(article)

    fun getSavedNews() =
        db.getArticleDao().getArticles()

    suspend fun deleteArticle(article: Article) =
        db.getArticleDao().deleteArticle(article)
}
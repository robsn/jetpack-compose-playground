package de.robinvinzenz.treasurehunt.news

import androidx.annotation.DrawableRes

data class News(
    val title: String,
    val subtitle: String,
    val description: String,
    val author: Author,
    val publishedAt : Long,
    @DrawableRes val image: Int,
    val liked: Boolean
)
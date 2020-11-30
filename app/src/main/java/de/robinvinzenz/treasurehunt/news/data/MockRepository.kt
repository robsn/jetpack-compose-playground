package de.robinvinzenz.treasurehunt.news.data

import de.robinvinzenz.treasurehunt.R
import de.robinvinzenz.treasurehunt.news.Author
import de.robinvinzenz.treasurehunt.news.News

class MockRepository {
    fun getAll() = listOf(
        News(
            "Headline1",
            "Subtitle1",
            "Description1",
            Author("Doe", "Jane", R.drawable.avatar),
            System.currentTimeMillis(),
            R.drawable.header,
            false
        ),
        News(
            "Headline2",
            "Subtitle2",
            "Description2",
            Author("Doe", "Jane", R.drawable.avatar),
            System.currentTimeMillis(),
            R.drawable.header,
            true
        ),
        News(
            "Headline3",
            "Subtitle3",
            "Description3",
            Author("Doe", "Jane", R.drawable.avatar),
            System.currentTimeMillis(),
            R.drawable.header,
            false
        ),
        News(
            "Headline4",
            "Subtitle4",
            "Description4",
            Author("Doe", "Jane", R.drawable.avatar),
            System.currentTimeMillis(),
            R.drawable.header,
            true
        ),
        News(
            "Headline5",
            "Subtitle5",
            "Description5",
            Author("Doe", "Jane", R.drawable.avatar),
            System.currentTimeMillis(),
            R.drawable.header,
            false
        ),
    )
}
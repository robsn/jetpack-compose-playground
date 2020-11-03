package de.robinvinzenz.treasurehunt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import de.robinvinzenz.treasurehunt.news.News
import de.robinvinzenz.treasurehunt.news.NewsStory

class MainActivity : AppCompatActivity() {

    private val dataProvider = listOf(
        News("Headline1", "Subtitle1", "Description1", R.drawable.header),
        News("Headline2", "Subtitle2", "Description2", R.drawable.header),
        News("Headline3", "Subtitle3", "Description3", R.drawable.header),
        News("Headline4", "Subtitle4", "Description4", R.drawable.header),
        News("Headline5", "Subtitle5", "Description5", R.drawable.header),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumn(modifier = Modifier.fillMaxSize()) {
                dataProvider.forEach { NewsStory(it) }
            }
        }
    }
}

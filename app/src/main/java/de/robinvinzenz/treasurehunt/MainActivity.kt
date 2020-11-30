package de.robinvinzenz.treasurehunt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import de.robinvinzenz.treasurehunt.news.NewsStory
import de.robinvinzenz.treasurehunt.news.data.MockRepository

class MainActivity : AppCompatActivity() {

    private val repository = MockRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumn(modifier = Modifier.fillMaxSize()) {
                repository.getAll().forEach { NewsStory(it) }
            }
        }
    }
}

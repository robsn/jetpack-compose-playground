package de.robinvinzenz.treasurehunt.news

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import de.robinvinzenz.treasurehunt.R

@Composable
fun NewsStory(news: News) {
    Column(modifier = Modifier.padding(12.dp)) {
        HeaderImage(news.image)
        Spacer(Modifier.preferredHeight(4.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Headline(news.title)
            Favorite(news.liked)
        }
        SubHeadline(news.subtitle)
        Content(news.description)
    }
}

@Composable
fun HeaderImage(imageResId: Int) {
    Image(
        imageResource(id = imageResId),
        modifier = Modifier
            .preferredHeight(180.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(4.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Headline(title: String) {
    Text(
        title,
        style = MaterialTheme.typography.h3,
        maxLines = 1,
        color = Color.Black,
        overflow = TextOverflow.Ellipsis,
    )
}

@Composable
fun SubHeadline(title: String) {
    Text(
        title,
        style = MaterialTheme.typography.h6,
    )
}

@Composable
private fun Content(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.body2,
    )
}

@Composable
fun Favorite(liked: Boolean) {
    val uiLiked = remember { mutableStateOf(liked) }
    IconButton(onClick = { uiLiked.value = uiLiked.value.not() }) {
        Icon(if (uiLiked.value) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder)
    }
}

@Preview
@Composable
fun DefaultNewsStory() {
    NewsStory(News("Headline", "Subtitle", "Lorem ipsum dolor sit amen", R.drawable.header, false))
}
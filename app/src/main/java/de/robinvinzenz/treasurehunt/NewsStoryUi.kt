package de.robinvinzenz.treasurehunt

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


@Composable
fun NewsStory() {
    val image = imageResource(id = R.drawable.header)
    Column(modifier = Modifier.padding(12.dp)) {
        val imageModifier = Modifier
            .preferredHeight(180.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(4.dp))


        Image(image, modifier = imageModifier,
            contentScale = ContentScale.Crop)

        Spacer(Modifier.preferredHeight(16.dp))

        Text("Headline", style = MaterialTheme.typography.h6,
            maxLines = 2,
            color = Color.Magenta,
            overflow = TextOverflow.Ellipsis)
        Text("Fake news subtitle",
            style = MaterialTheme.typography.body2)
        Text("A small description to describe an old story which was irrelevant for some time and was now put on the table in order to add some salt in the soup to tackel an opponent in the media.",
            style = MaterialTheme.typography.body2)
    }
}

@Preview
@Composable
fun DefaultNewsStory() {
    NewsStory()
}
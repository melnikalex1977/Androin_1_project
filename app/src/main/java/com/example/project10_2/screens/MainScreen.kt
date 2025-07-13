package com.example.project10_2.screens

import com.example.project10_2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview (showBackground = true)
@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.creenshot_4),
        contentDescription = "im1",
        modifier = Modifier.fillMaxSize()
            .alpha(0.6f),
        contentScale = ContentScale.FillBounds
    )
}
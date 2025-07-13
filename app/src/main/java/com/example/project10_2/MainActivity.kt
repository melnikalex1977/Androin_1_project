package com.example.project10_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.project10_2.screens.MainScreen
import com.example.project10_2.screens.TabLayout
import com.example.project10_2.ui.theme.Project10_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project10_2Theme {
                Image(
                    painter = painterResource(id = R.drawable.creenshot_4),
                    contentDescription = "im1",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.6f),
                    contentScale = ContentScale.FillBounds
                )
                Column{
                    MainScreen()
                    TabLayout()
                }

            }




        }
    }
}

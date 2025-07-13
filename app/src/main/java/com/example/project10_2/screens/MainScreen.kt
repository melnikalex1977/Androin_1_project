package com.example.project10_2.screens

import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.project10_2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.project10_2.ui.theme.Bluerr

@Preview(showBackground = true)
@Composable
fun MainScreen() {

    Column(
        modifier = Modifier
            //.fillMaxSize()
            .padding(5.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Bluerr),
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.padding(top = 18.dp, start = 18.dp),
                        text = "20 Jun 2015 14:00",
                        style = TextStyle(fontSize = 15.sp, color = Color.White)
                    )
                    AsyncImage(
                        model = "https://cdn.weatherapi.com/weather/64x64/night/116.png",
                        contentDescription = "im2",
                        modifier = Modifier
                            .size(55.dp)
                            .padding(top = 36.dp, end = 8.dp)
                    )
                }
                Text(
                    text = "Madrid",
                    style = TextStyle(fontSize = 25.sp, color = Color.White),
                    color = Color.White
                )
                Text(
                    text = "23C",
                    style = TextStyle(fontSize = 65.sp, color = Color.White),
                    color = Color.White
                )
                Text(
                    text = "Sunny",
                    style = TextStyle(fontSize = 16.sp, color = Color.White),
                    color = Color.White
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(
                        onClick = { }
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "im3",
                            tint = Color.White
                        )
                    }
                    Text(
                        text = "23C/12C",
                        style = TextStyle(fontSize = 16.sp, color = Color.White),
                        color = Color.White
                    )

                    IconButton(
                        onClick = { }
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.access),
                            contentDescription = "im3",
                            tint = Color.White
                        )
                    }
                }
            }

        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabLayout(){
    var tablist = listOf("HOURS", "DAYS")
    var pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tablist.size } // або конкретне число: { 3 }
    )
    var tabIndex = pagerState.currentPage
    var coroutineScope = rememberCoroutineScope()

    Column(modifier = Modifier.padding(start = 5.dp, end = 5.dp).clip(RoundedCornerShape(5.dp))
    ) {
        TabRow(
            selectedTabIndex = tabIndex,
            indicator = {},
            containerColor = Bluerr,
            //indicator = { tabPositions ->
                //TabRowDefaults.SecondaryIndicator(
                //    modifier = Modifier.tabIndicatorOffset(pagerState, tabPositions)
                //)
           // },

        ) {
            tablist.forEachIndexed{index, text ->
                Tab(
                    selected = false,
                    onClick = {

                    },
                    text = {
                        Text(text = text)
                    }
                )
            }

        }
    }
}
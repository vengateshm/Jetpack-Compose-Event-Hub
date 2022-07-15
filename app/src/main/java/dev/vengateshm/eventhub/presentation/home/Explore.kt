package dev.vengateshm.eventhub.presentation.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.composables.Chip
import dev.vengateshm.eventhub.presentation.composables.HoriSpace
import dev.vengateshm.eventhub.presentation.home.bottomNav.BottomBar
import dev.vengateshm.eventhub.presentation.ui.theme.*

@Composable
fun ExploreScreen(
    navController: NavController,
    onToolBarMenuIconClick: () -> Unit,
    onNotificationIconClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            HomeToolBar(
                onToolBarMenuIconClick = {
                    onToolBarMenuIconClick()
                },
                onNotificationIconClick = {
                    onNotificationIconClick()
                }
            )
        },
        bottomBar = {
            BottomBar(
                navController = navController,
                onBottomBarItemClick = {
                    when (it.title) {
                        "Explore" -> {
                            navController.navigate(Screen.Home.route)
                        }
                        "Events" -> {
                            navController.navigate(Screen.Events.route)
                        }
                        "Map" -> {
                            navController.navigate(Screen.Map.route)
                        }
                        "Profile" -> {
                            navController.navigate(Screen.MyProfile.route)
                        }
                    }
                })
        }
    ) {
        val chipItems = listOf(
            ExploreChipItem("Sports", R.drawable.ic_sports, Color_EE544A),
            ExploreChipItem("Music", R.drawable.ic_music, Color_6B7AED),
            ExploreChipItem("Food", R.drawable.ic_food, Color_29D697),
            ExploreChipItem("Art", R.drawable.ic_art, Color_39C3F2),
        )
        Column {
            HomeSearchBar()
            Box(modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(
                            color = Color_4A43EC,
                            shape = RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp))
                )
                LazyRow(
                    modifier = Modifier.padding(top = 25.dp),
                    contentPadding = PaddingValues(start = 16.dp)) {
                    items(chipItems) { item ->
                        Chip(
                            bgColor = item.color,
                            iconRes = item.iconRes,
                            text = item.text,
                            textColor = Color.White,
                            iconTint = Color.White)
                        HoriSpace(dp = 16.dp)
                    }
                }
            }
        }
    }
}

data class ExploreChipItem(val text: String, @DrawableRes val iconRes: Int, val color: Color)
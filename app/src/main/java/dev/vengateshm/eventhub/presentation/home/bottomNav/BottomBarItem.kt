package dev.vengateshm.eventhub.presentation.home.bottomNav

import androidx.annotation.DrawableRes
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.ui.theme.Screen

data class BottomBarItem(val route: String, val title: String, @DrawableRes val iconRes: Int) {
    companion object {
        fun getBottomBarItems() = listOf(
            BottomBarItem(Screen.Home.route, "Explore", R.drawable.ic_bottom_nav_compass),
            BottomBarItem(Screen.Events.route, "Events", R.drawable.ic_bottom_nav_calendar),
            BottomBarItem(Screen.Map.route, "Map", R.drawable.ic_bottom_nav_map),
            BottomBarItem(Screen.MyProfile.route, "Profile", R.drawable.ic_bottom_nav_profile),
        )
    }
}

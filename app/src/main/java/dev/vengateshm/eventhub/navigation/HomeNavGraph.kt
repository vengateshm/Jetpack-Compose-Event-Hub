package dev.vengateshm.eventhub.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import dev.vengateshm.eventhub.presentation.home.HomeScreen
import dev.vengateshm.eventhub.presentation.ui.theme.Screen

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {
    composable(Screen.Home.route) {
        HomeScreen(
            navController = navController,
            onLogoutClick = {

            }
        )
    }
}
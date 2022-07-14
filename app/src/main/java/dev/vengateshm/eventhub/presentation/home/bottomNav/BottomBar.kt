package dev.vengateshm.eventhub.presentation.home.bottomNav

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import dev.vengateshm.eventhub.presentation.ui.theme.Color_5669FF

@Composable
fun BottomBar(
    navController: NavController,
    onBottomBarItemClick: (BottomBarItem) -> Unit,
) {
    val items = BottomBarItem.getBottomBarItems()
    BottomNavigation(
        backgroundColor = Color.White,
        elevation = 5.dp
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.map {
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = it.iconRes),
                        contentDescription = it.title
                    )
                },
                label = {
                    Text(
                        text = it.title
                    )
                },
                selected = /*currentRoute == it.route*/ it.title == "Explore",
                selectedContentColor = Color_5669FF,
                unselectedContentColor = Color_5669FF.copy(alpha = 0.4f),
                onClick = {
                    onBottomBarItemClick(it)
                    /*navController.navigate(it.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        restoreState = true
                        launchSingleTop = true
                    }*/
                }
            )
        }
    }
}
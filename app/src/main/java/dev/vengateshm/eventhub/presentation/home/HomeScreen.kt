package dev.vengateshm.eventhub.presentation.home

import androidx.compose.material.DrawerValue
import androidx.compose.material.ModalDrawer
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.vengateshm.eventhub.presentation.home.drawer.Drawer
import dev.vengateshm.eventhub.presentation.home.drawer.DrawerItem
import dev.vengateshm.eventhub.presentation.notifications.NotificationListScreen
import dev.vengateshm.eventhub.presentation.ui.theme.Screen
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(onLogoutClick: () -> Unit) {
    val coroutineScope = rememberCoroutineScope()
    val drawerMenuList = remember {
        DrawerItem.getDrawerMenuList()
    }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    var selectedDrawerItem by remember {
        mutableStateOf("My Profile")
    }

    val closeDrawer = {
        coroutineScope.launch {
            drawerState.close()
        }
    }

    val openDrawer = {
        coroutineScope.launch {
            drawerState.open()
        }
    }

    val navController = rememberNavController()

    ModalDrawer(
        drawerState = drawerState,
        drawerBackgroundColor = Color.White,
        drawerContent = {
            Drawer(
                selectedDrawerItem = selectedDrawerItem,
                drawerMenuList = drawerMenuList,
                closeDrawer = {
                    closeDrawer()
                },
                onDrawerItemClick = { drawerItem ->
                    closeDrawer()

                    selectedDrawerItem = drawerItem.title

                    when (drawerItem.title) {
                        "My Profile" -> {
                            navController.navigate(
                                route = Screen.MyProfile.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Message" -> {
                            navController.navigate(
                                route = Screen.Message.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Calendar" -> {
                            navController.navigate(
                                route = Screen.Calendar.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Bookmark" -> {
                            navController.navigate(
                                route = Screen.Bookmark.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Contact Us" -> {
                            navController.navigate(
                                route = Screen.ContactUs.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Settings" -> {
                            navController.navigate(
                                route = Screen.Settings.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Help & FAQs" -> {
                            navController.navigate(
                                route = Screen.HelpsFAQs.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Sign Out" -> {
                            onLogoutClick()
                        }
                    }
                },
            )
        }) {
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route) {
            composable(route = Screen.Home.route) {
                Home(
                    onToolBarMenuIconClick = {
                        openDrawer()
                    },
                    onNotificationIconClick = {
                        navController.navigate(
                            route = Screen.Notification.route
                        )/* {
                            popUpTo(navController.graph.startDestinationRoute!!)
                            launchSingleTop = true
                        }*/
                    }
                )
            }
            composable(route = Screen.Notification.route) {
                NotificationListScreen()
            }
        }
    }
}
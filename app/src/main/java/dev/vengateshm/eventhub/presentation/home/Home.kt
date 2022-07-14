package dev.vengateshm.eventhub.presentation.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Home(
    onToolBarMenuIconClick: () -> Unit,
    onNotificationIconClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            HomeToolBar(
                onToolBarMenuIconClick = onToolBarMenuIconClick,
                onNotificationIconClick = onNotificationIconClick
            )
        },
        bottomBar = {

        }
    ) {

    }
}
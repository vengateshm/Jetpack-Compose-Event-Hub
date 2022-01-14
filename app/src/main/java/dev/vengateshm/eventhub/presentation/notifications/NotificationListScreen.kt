package dev.vengateshm.eventhub.presentation.notifications

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.composables.EHEmptyState
import dev.vengateshm.eventhub.presentation.composables.EHTitleBarMore

@Composable
fun NotificationListScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        EHTitleBarMore(title = stringResource(id = R.string.notifications))
    }
    EHEmptyState(
        imageRes = R.drawable.empty_notifications,
        title = stringResource(id = R.string.empty_notifications_title),
        message = stringResource(id = R.string.empty_notifications_message))
}
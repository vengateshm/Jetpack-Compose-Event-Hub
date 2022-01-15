package dev.vengateshm.eventhub.presentation.notifications

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.data.repositories.NotificationRepositoryImpl
import dev.vengateshm.eventhub.presentation.composables.EHEmptyState
import dev.vengateshm.eventhub.presentation.composables.EHTitleBarMore
import dev.vengateshm.eventhub.presentation.composables.VertiSpace
import dev.vengateshm.eventhub.presentation.notifications.composables.NotificationListItem

@Composable
fun NotificationListScreen() {
    val repo = NotificationRepositoryImpl()
    val notificationList = repo.getNotifications()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        EHTitleBarMore(title = stringResource(id = R.string.notifications))
        if (notificationList.isEmpty()) {
            EHEmptyState(
                imageRes = R.drawable.empty_notifications,
                title = stringResource(id = R.string.empty_notifications_title),
                message = stringResource(id = R.string.empty_notifications_message)
            )
        } else {
            LazyColumn(contentPadding = PaddingValues(16.dp)) {
                items(notificationList) { notification ->
                    NotificationListItem(notification = notification)
                    VertiSpace(dp = 16.dp)
                }
            }
        }
    }
}
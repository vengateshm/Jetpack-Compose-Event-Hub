package dev.vengateshm.eventhub.presentation.notifications.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.domain.models.Notification
import dev.vengateshm.eventhub.domain.models.NotificationType
import dev.vengateshm.eventhub.presentation.composables.*
import dev.vengateshm.eventhub.presentation.ui.theme.NotificationMessageTextColor

@Composable
fun NotificationListItem(notification: Notification) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Top
    ) {
        Image(
            painter = painterResource(id = notification.profilePic!!), contentDescription = "",
            modifier = Modifier
                .size(60.dp)
                .background(
                    color = Color.Transparent,
                    shape = CircleShape
                )
                .clip(CircleShape)
        )
        HoriSpace(dp = 16.dp)
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = NotificationMessageTextColor,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append(text = notification.notificationUserName)
                    }
                    append(" ")
                    withStyle(
                        style = SpanStyle(
                            color = NotificationMessageTextColor,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                    ) {
                        append(text = notification.notificationMessage)
                    }
                })
            if (notification.notificationType == NotificationType.EVENT_INVITE.name) {
                VertiSpace(dp = 8.dp)
                Row {
                    EHOutlinedButton(
                        text = stringResource(id = R.string.reject),
                        modifier = Modifier.weight(1f)
                    )
                    HoriSpace(dp = 4.dp)
                    EHFilledButton(
                        text = stringResource(id = R.string.accept),
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
        Text(
            text = notification.timeAndDate,
            style = NotificationDateTextStyle
        )
    }
}
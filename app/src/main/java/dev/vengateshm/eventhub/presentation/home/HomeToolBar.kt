package dev.vengateshm.eventhub.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.composables.HoriSpace
import dev.vengateshm.eventhub.presentation.ui.theme.Color_4A43EC

@Composable
fun HomeToolBar(
    onToolBarMenuIconClick: () -> Unit,
    onNotificationIconClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color_4A43EC)
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { onToolBarMenuIconClick() }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_drawer_icon),
                tint = Color.White,
                contentDescription = "Drawer Icon"
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Current Location",
                    fontSize = 12.sp,
                    color = Color(0xFFFFFFFF),
                )
                HoriSpace(dp = 4.dp)
                Image(
                    painter = painterResource(id = R.drawable.ic_drop_down_arrow),
                    contentDescription = "Drawer Icon")
            }
            Text(
                text = "New York, USA",
                fontSize = 13.sp,
                color = Color(0xFFF4F4FE))
        }
        IconButton(onClick = { onNotificationIconClick() }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_notification_bell),
                tint = Color.White,
                contentDescription = "Notification Icon"
            )
        }
    }
}
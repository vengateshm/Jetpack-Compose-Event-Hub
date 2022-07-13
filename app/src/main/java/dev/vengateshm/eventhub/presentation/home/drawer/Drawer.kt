package dev.vengateshm.eventhub.presentation.home.drawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.eventhub.presentation.composables.HoriSpace
import dev.vengateshm.eventhub.presentation.composables.VertiSpace

@Composable
fun Drawer(
    selectedDrawerItem: String,
    drawerMenuList: List<DrawerItem>,
    onDrawerItemClick: (DrawerItem) -> Unit,
    closeDrawer: () -> Unit,
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Image(
            painter = painterResource(id = dev.vengateshm.eventhub.R.drawable.drawer_profile_pic),
            contentDescription = "Profile avatar",
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(percent = 60))
        )
        VertiSpace(dp = 12.dp)
        Text(
            text = "Vengatesh M",
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
            color = Color(0XFF000000)
        )
        Spacer(modifier = Modifier.height(32.dp))

        drawerMenuList.forEach { drawerItem ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onDrawerItemClick(drawerItem)
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                /*Box(
                    modifier = Modifier
                        .width(8.dp)
                        .height(32.dp)
                        .background(
                            color = if (drawerItem.title == selectedDrawerItem) Color(0XFF567DF4) else Color(
                                0XFFFFFFFF
                            )
                        )
                )*/
                Image(
                    painter = painterResource(id = drawerItem.iconRes),
                    contentDescription = "$drawerItem drawer menu icon",
                    modifier = Modifier
                        .size(24.dp)
                )
                HoriSpace(dp = 24.dp)
                Text(
                    text = drawerItem.title,
                    fontSize = 16.sp,
                    fontWeight = /*if (drawerItem.title == selectedDrawerItem) FontWeight(700) else */FontWeight(
                        500
                    ),
                    color = Color(0XFF000000)
                )
            }
            VertiSpace(dp = 24.dp)
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .background(color = Color(0x3300F8FF),
                    shape = RoundedCornerShape(8.dp))
                .padding(
                    horizontal = 16.dp,
                    vertical = 8.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(id = dev.vengateshm.eventhub.R.drawable.ic_drawer_upgrade_icon),
                contentDescription = "Upgrade icon",
                modifier = Modifier.wrapContentSize(),
                tint = Color(0XFF00F8FF)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Upgrade Pro",
                color = Color(0XFF00F8FF)
            )
        }

        Spacer(modifier = Modifier.height(64.dp))
    }
}
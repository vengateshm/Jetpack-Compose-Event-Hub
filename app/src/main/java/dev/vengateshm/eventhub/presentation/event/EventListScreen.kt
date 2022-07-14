package dev.vengateshm.eventhub.presentation.event

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.data.repositories.EventRepoImpl
import dev.vengateshm.eventhub.domain.models.Event
import dev.vengateshm.eventhub.presentation.composables.EHEmptyState
import dev.vengateshm.eventhub.presentation.composables.EHTitleBarMore
import dev.vengateshm.eventhub.presentation.composables.HoriSpace
import dev.vengateshm.eventhub.presentation.composables.VertiSpace
import dev.vengateshm.eventhub.presentation.ui.theme.Color_5669FF
import dev.vengateshm.eventhub.presentation.ui.theme.Color_747688
import dev.vengateshm.eventhub.presentation.ui.theme.PrimaryBlack1

@Composable
fun EventListScreen(navController: NavController) {
    val repo = EventRepoImpl()
    val eventList = repo.getEvents()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF2F2F2))
    ) {
        EHTitleBarMore(
            title = stringResource(id = R.string.events),
            onBackArrowClick = {
                navController.navigateUp()
            })
        if (eventList.isEmpty()) {
            EHEmptyState(
                imageRes = R.drawable.no_events,
                title = stringResource(id = R.string.no_events),
                message = stringResource(id = R.string.empty_notifications_message)
            )
        } else {
            LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp)) {
                items(eventList) { event ->
                    EventListItem(event)
                    VertiSpace(dp = 16.dp)
                }
            }
        }
    }
}

@Composable
fun EventListItem(event: Event) {
    Row(modifier = Modifier
        .background(
            color = Color.White,
            shape = RoundedCornerShape(16.dp)
        )
        .padding(16.dp)) {
        Image(
            modifier = Modifier.size(width = 80.dp, height = 90.dp),
            painter = painterResource(id = event.thumbImgRes),
            contentDescription = "${event.title} thumb")
        HoriSpace(dp = 16.dp)
        Column(modifier = Modifier
            .fillMaxWidth()) {
            Text(modifier = Modifier
                .fillMaxWidth(),
                text = event.date,
                fontSize = 13.sp,
                fontWeight = FontWeight(400),
                color = Color_5669FF
            )
            VertiSpace(dp = 6.dp)
            Text(modifier = Modifier
                .fillMaxWidth(),
                text = event.title,
                fontSize = 15.sp,
                fontWeight = FontWeight(500),
                color = PrimaryBlack1
            )
            VertiSpace(dp = 6.dp)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_location_event),
                    contentDescription = "location")
                HoriSpace(dp = 8.dp)
                Text(
                    text = event.location,
                    fontSize = 13.sp,
                    fontWeight = FontWeight(400),
                    color = Color_747688
                )
            }
        }
    }
}
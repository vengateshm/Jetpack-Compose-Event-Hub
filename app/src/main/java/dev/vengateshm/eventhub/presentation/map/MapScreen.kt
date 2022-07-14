package dev.vengateshm.eventhub.presentation.map

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import dev.vengateshm.eventhub.data.repositories.EventRepoImpl
import dev.vengateshm.eventhub.presentation.composables.Chip
import dev.vengateshm.eventhub.presentation.composables.HoriSpace
import dev.vengateshm.eventhub.presentation.event.EventListItem

@Composable
fun MapScreen(navController: NavController) {
    val singapore = LatLng(1.35, 103.87)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(singapore, 15f)
    }
    val repo = EventRepoImpl()
    val eventList = repo.getEvents()

    val textFieldState = remember {
        mutableStateOf(TextFieldValue())
    }

    val chipItems = listOf(
        MapChipItem("Sports", dev.vengateshm.eventhub.R.drawable.ic_sports),
        MapChipItem("Music", dev.vengateshm.eventhub.R.drawable.ic_music),
        MapChipItem("Food", dev.vengateshm.eventhub.R.drawable.ic_food),
        MapChipItem("Art", dev.vengateshm.eventhub.R.drawable.ic_art),
    )

    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        )
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.TopCenter)) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
                Card(modifier = Modifier
                    .height(60.dp)
                    .weight(1f),
                    shape = RoundedCornerShape(12.dp)) {
                    Row(modifier = Modifier
                        .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically) {
                        HoriSpace(dp = 16.dp)
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                painter = painterResource(id = dev.vengateshm.eventhub.R.drawable.ic_arrow_left),
                                contentDescription = "Back Arrow")
                        }
                        HoriSpace(dp = 16.dp)
                        Box {
                            BasicTextField(
                                value = textFieldState.value,
                                onValueChange = { textFieldState.value = it },
                            )
                            if (textFieldState.value.text.isEmpty()) {
                                Text(
                                    text = "Find events nearby"
                                )
                            }
                        }
                    }
                }
                HoriSpace(dp = 16.dp)
                Card(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(12.dp)) {
                    Image(modifier = Modifier.wrapContentSize(),
                        painter = painterResource(id = dev.vengateshm.eventhub.R.drawable.ic_current_location),
                        contentDescription = "Map Current Location")
                }
            }
            LazyRow(contentPadding = PaddingValues(start = 16.dp)) {
                items(chipItems) { item ->
                    Chip(
                        iconRes = item.iconRes,
                        text = item.text)
                    HoriSpace(dp = 16.dp)
                }
            }
        }

        if (eventList.isNotEmpty()) {
            LazyRow(
                modifier = Modifier
                    .align(Alignment.BottomCenter),
                contentPadding = PaddingValues(start = 16.dp)) {
                items(eventList) { event ->
                    EventListItem(event)
                    HoriSpace(dp = 16.dp)
                }
            }
        }
    }
}

data class MapChipItem(val text: String, @DrawableRes val iconRes: Int)
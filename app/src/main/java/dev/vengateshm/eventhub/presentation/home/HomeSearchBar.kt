package dev.vengateshm.eventhub.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.composables.HoriSpace
import dev.vengateshm.eventhub.presentation.ui.theme.Color_4A43EC
import dev.vengateshm.eventhub.presentation.ui.theme.Color_5D56F3
import dev.vengateshm.eventhub.presentation.ui.theme.Color_A29EF0

@Composable
fun HomeSearchBar() {
    val textFieldState = remember {
        mutableStateOf(TextFieldValue())
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color_4A43EC),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                tint = Color.White,
                contentDescription = "Search Icon"
            )
        }
        Icon(
            modifier = Modifier.padding(horizontal = 4.dp),
            painter = painterResource(id = R.drawable.ic_line),
            contentDescription = "Search Icon",
            tint = Color.White.copy(alpha = 0.3f)
        )
        Box(modifier = Modifier.weight(1f)) {
            BasicTextField(
                value = textFieldState.value,
                onValueChange = { textFieldState.value = it },
            )
            if (textFieldState.value.text.isEmpty()) {
                Text(
                    text = "Search...",
                    color = Color.White.copy(alpha = 0.3f)
                )
            }
        }
        Box(
            modifier = Modifier
                .background(
                    color = Color_5D56F3,
                    shape = RoundedCornerShape(25.dp))
        ) {
            Row(
                modifier = Modifier.padding(all = 8.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_filter),
                    contentDescription = "Search Icon",
                    tint = Color_A29EF0
                )
                HoriSpace(dp = 4.dp)
                Text(text = "Filters",
                    fontSize = 12.sp,
                    color = Color.White)
            }
        }
        HoriSpace(dp = 8.dp)
    }
}
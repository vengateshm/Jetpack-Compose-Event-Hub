package dev.vengateshm.eventhub.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.ui.theme.EHButtonFillColor

@Composable
fun EHButton(showArrow: Boolean = false, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = EHButtonFillColor,
                shape = RoundedCornerShape(10.dp)
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = EHButtonTextStyle
        )
        if (showArrow) {
            Icon(
                painter = painterResource(id = R.drawable.ic_btn_arrow_circled),
                contentDescription = "$text arrow icon"
            )
        }
    }
}

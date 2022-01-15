package dev.vengateshm.eventhub.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.ui.theme.EHButtonFillColor
import dev.vengateshm.eventhub.ui.theme.OutlinedButtonBorderColor

@Composable
fun EHButton(showArrow: Boolean = false, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = EHButtonFillColor,
                shape = RoundedCornerShape(10.dp)
            )
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = EHButtonTextStyle,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center
        )
        if (showArrow) {
            Image(
                painter = painterResource(id = R.drawable.ic_btn_arrow_circled),
                contentDescription = "$text arrow icon"
            )
        }
    }
}

@Composable
fun EHOutlinedButton(text: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .border(
                width = 1.dp,
                color = OutlinedButtonBorderColor,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = EHOutlinedButtonTextStyle,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun EHFilledButton(text: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(
                color = EHButtonFillColor,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = EHFilledButtonTextStyle,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center
        )
    }
}

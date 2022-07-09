package dev.vengateshm.eventhub.presentation.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.ui.theme.EHButtonFillColor
import dev.vengateshm.eventhub.presentation.ui.theme.OutlinedButtonBorderColor

@Composable
fun EHButton(modifier: Modifier = Modifier, showArrow: Boolean = false, text: String) {
    Row(
        modifier = modifier
            .background(
                color = EHButtonFillColor,
                shape = RoundedCornerShape(15.dp)
            )
            .padding(horizontal = 12.dp, vertical = 12.dp),
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

@Composable
fun EHSocialButton(modifier: Modifier = Modifier, @DrawableRes iconRes: Int, text: String) {
    Row(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(15.dp)
            )
            .padding(horizontal = 12.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = "$text social icon"
        )
        HoriSpace(dp = 16.dp)
        Text(
            text = text,
            textAlign = TextAlign.Center
        )
    }
}
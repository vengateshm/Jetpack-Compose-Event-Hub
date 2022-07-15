package dev.vengateshm.eventhub.presentation.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.eventhub.presentation.ui.theme.Color_8A8D9F

@Composable
fun Chip(
    bgColor: Color = Color.White,
    @DrawableRes iconRes: Int,
    iconTint: Color? = null,
    text: String,
    textColor: Color = Color_8A8D9F,
) {
    Row(modifier = Modifier
        .background(bgColor, shape = RoundedCornerShape(25.dp))
        .padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = "$text chip icon",
        colorFilter = iconTint?.let { ColorFilter.tint(it) })
        HoriSpace(dp = 16.dp)
        Text(
            text = text,
            fontSize = 16.sp,
            color = textColor)
    }
}
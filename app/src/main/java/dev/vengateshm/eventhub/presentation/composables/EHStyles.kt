package dev.vengateshm.eventhub.presentation.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.vengateshm.eventhub.ui.theme.EHTitleBarColor
import dev.vengateshm.eventhub.ui.theme.HintTextColor
import dev.vengateshm.eventhub.ui.theme.PrimaryBlack1

val EHButtonTextStyle = TextStyle(
    color = Color.White,
    fontSize = 16.sp,
    fontWeight = FontWeight(400)
)

val EHTitleBarTitleStyle = TextStyle(
    color = EHTitleBarColor,
    fontSize = 24.sp,
    fontWeight = FontWeight(400)
)

val OnBoardingInfoTextStyle = TextStyle(
    color = PrimaryBlack1,
    fontSize = 16.sp,
    fontWeight = FontWeight(400)
)

val HintTextStyle = TextStyle(
    color = HintTextColor,
    fontSize = 14.sp,
    fontWeight = FontWeight(400)
)

val TextFieldTextStyle = TextStyle(
    color = PrimaryBlack1,
    fontSize = 14.sp,
    fontWeight = FontWeight(400)
)
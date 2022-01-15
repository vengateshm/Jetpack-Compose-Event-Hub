package dev.vengateshm.eventhub.presentation.otp_verification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.core.OTP_DIGIT_LENGTH
import dev.vengateshm.eventhub.presentation.composables.EHButton
import dev.vengateshm.eventhub.presentation.composables.EHTitleBarTitleStyle
import dev.vengateshm.eventhub.presentation.composables.OnBoardingInfoTextStyle
import dev.vengateshm.eventhub.presentation.composables.VertiSpace
import dev.vengateshm.eventhub.presentation.otp_verification.composables.OTPTextFields

@Composable
fun OtpVerificationScreen() {

    val otp = remember { mutableStateOf(StringBuilder()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_arrow),
                contentDescription = "Back arrow"
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            VertiSpace(dp = 24.dp)
            Text(
                text = stringResource(id = R.string.verification),
                style = EHTitleBarTitleStyle
            )
            VertiSpace(dp = 16.dp)
            Text(
                text = stringResource(id = R.string.verification_msg),
                style = OnBoardingInfoTextStyle
            )
            VertiSpace(dp = 16.dp)
            OTPTextFields(length = OTP_DIGIT_LENGTH, onFilled = {

            })
            VertiSpace(dp = 32.dp)
            EHButton(text = stringResource(id = R.string.btn_txt_continue), showArrow = true)
        }
    }
}
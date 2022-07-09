package dev.vengateshm.eventhub.presentation.reset_password

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.composables.*
import dev.vengateshm.eventhub.presentation.ui.theme.TextFieldOutlineColor

@Composable
fun ResetPasswordScreen(navController: NavController) {
    BackHandler(onBack = {
        navController.navigateUp()
    })
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        IconButton(onClick = { navController.navigateUp() }) {
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
                text = stringResource(id = R.string.reset_password),
                style = EHTitleBarTitleStyle
            )
            VertiSpace(dp = 16.dp)
            Text(
                text = stringResource(id = R.string.reset_pwd_msg),
                style = OnBoardingInfoTextStyle
            )
            VertiSpace(dp = 16.dp)
            TransparentHintTextField(
                text = "",
                hint = stringResource(id = R.string.email_hint),
                iconRes = R.drawable.ic_mail,
                isHintVisible = true,
                textStyle = TextFieldTextStyle,
                hintTextStyle = HintTextStyle,
                singleLine = true,
                onValueChange = {

                },
                onFocusChange = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, color = TextFieldOutlineColor, shape = RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            )
            VertiSpace(dp = 32.dp)
            EHButton(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .align(Alignment.CenterHorizontally),
                text = stringResource(id = R.string.send),
                showArrow = true)
        }
    }
}
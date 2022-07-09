package dev.vengateshm.eventhub.presentation.sign_in

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.composables.*
import dev.vengateshm.eventhub.presentation.ui.theme.*

@Composable
fun SignInScreen(navController: NavController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(scrollState)
    ) {
        VertiSpace(dp = 32.dp)
        Image(
            painter = painterResource(id = R.drawable.app_icon),
            contentDescription = "App icon",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.event_hub),
            fontSize = 35.sp,
            color = Color_37364A,
            textAlign = TextAlign.Center
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            VertiSpace(dp = 16.dp)
            Text(
                text = stringResource(id = R.string.sign_in),
                style = EHTitleBarTitleStyle
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
            VertiSpace(dp = 8.dp)
            TransparentHintTextField(
                text = "",
                hint = stringResource(id = R.string.your_password_hint),
                iconRes = R.drawable.ic_password,
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
            VertiSpace(dp = 20.dp)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Remember Me")
                Text(
                    modifier = Modifier.clickable { navController.navigate(Screen.ResetPassword.route) },
                    text = "Forgot Password?")
            }
            VertiSpace(dp = 16.dp)
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "OR",
                color = Color_9D9898,
                textAlign = TextAlign.Center)
            VertiSpace(dp = 16.dp)
            EHButton(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .align(Alignment.CenterHorizontally)
                    .clickable {
                        navController.navigate(Screen.OtpVerification.route)
                    },
                text = stringResource(id = R.string.btn_txt_sign_in), showArrow = true)
            VertiSpace(dp = 16.dp)
            EHSocialButton(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .align(Alignment.CenterHorizontally),
                iconRes = R.drawable.ic_google,
                text = "Login with Google")
            VertiSpace(dp = 16.dp)
            EHSocialButton(modifier = Modifier
                .fillMaxWidth(0.85f)
                .align(Alignment.CenterHorizontally),
                iconRes = R.drawable.ic_fb,
                text = "Login with Facebook")
            VertiSpace(dp = 16.dp)
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screen.SignUp.route)
                    },
                text = buildAnnotatedString {
                    append("Don't have an account? ")
                    withStyle(style = SpanStyle(color = Color_5669FA)) {
                        append(stringResource(id = R.string.sign_up))
                    }
                },
                textAlign = TextAlign.Center)
        }
    }
}
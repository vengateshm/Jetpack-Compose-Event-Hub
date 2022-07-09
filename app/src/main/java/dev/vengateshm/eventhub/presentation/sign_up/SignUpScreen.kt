package dev.vengateshm.eventhub.presentation.sign_up

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.*
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.presentation.composables.*
import dev.vengateshm.eventhub.presentation.ui.theme.Color_5669FA
import dev.vengateshm.eventhub.presentation.ui.theme.Color_9D9898
import dev.vengateshm.eventhub.presentation.ui.theme.TextFieldOutlineColor

@Composable
fun SignUpScreen(navController: NavController) {
    BackHandler(onBack = {
        navController.navigateUp()
    })
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(scrollState)
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
            VertiSpace(dp = 16.dp)
            Text(
                text = stringResource(id = R.string.sign_up),
                style = EHTitleBarTitleStyle
            )
            VertiSpace(dp = 16.dp)
            TransparentHintTextField(
                text = "",
                hint = stringResource(id = R.string.full_name_hint),
                iconRes = R.drawable.ic_full_name,
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
            VertiSpace(dp = 8.dp)
            TransparentHintTextField(
                text = "",
                hint = stringResource(id = R.string.confirm_password_hint),
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
            VertiSpace(dp = 32.dp)
            EHButton(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .align(Alignment.CenterHorizontally),
                text = stringResource(id = R.string.btn_txt_sign_up),
                showArrow = true)
            VertiSpace(dp = 16.dp)
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "OR",
                color = Color_9D9898,
                textAlign = TextAlign.Center)
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
                        navController.navigateUp()
                    },
                text = buildAnnotatedString {
                    append("Already have an account? ")
                    withStyle(style = SpanStyle(color = Color_5669FA)) {
                        append(stringResource(id = R.string.sign_in))
                    }
                },
                textAlign = TextAlign.Center)
        }
    }
}
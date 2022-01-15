package dev.vengateshm.eventhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.vengateshm.eventhub.presentation.notifications.NotificationListScreen
import dev.vengateshm.eventhub.presentation.otp_verification.OtpVerificationScreen
import dev.vengateshm.eventhub.presentation.reset_password.ResetPasswordScreen
import dev.vengateshm.eventhub.ui.theme.EventHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    OtpVerificationScreen()
                }
            }
        }
    }
}
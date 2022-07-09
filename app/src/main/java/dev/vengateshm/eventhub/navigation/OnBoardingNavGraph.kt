package dev.vengateshm.eventhub.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import dev.vengateshm.eventhub.presentation.onBoardingSlider.OnBoardingSliderScreen
import dev.vengateshm.eventhub.presentation.otp_verification.OtpVerificationScreen
import dev.vengateshm.eventhub.presentation.reset_password.ResetPasswordScreen
import dev.vengateshm.eventhub.presentation.sign_in.SignInScreen
import dev.vengateshm.eventhub.presentation.sign_up.SignUpScreen
import dev.vengateshm.eventhub.presentation.splash.SplashScreen
import dev.vengateshm.eventhub.presentation.ui.theme.Screen

fun NavGraphBuilder.onBoardingNavGraph(navController: NavController) {
    composable(Screen.Splash.route) {
        SplashScreen(navController = navController)
    }
    composable(Screen.OnBoardingSlider.route) {
        OnBoardingSliderScreen(navController = navController)
    }
    composable(Screen.SignIn.route) {
        SignInScreen(navController = navController)
    }
    composable(Screen.SignUp.route) {
        SignUpScreen(navController = navController)
    }
    composable(Screen.OtpVerification.route) {
        OtpVerificationScreen(navController = navController)
    }
    composable(Screen.ResetPassword.route) {
        ResetPasswordScreen(navController = navController)
    }
}
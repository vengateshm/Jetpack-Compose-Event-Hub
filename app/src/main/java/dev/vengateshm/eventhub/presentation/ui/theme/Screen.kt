package dev.vengateshm.eventhub.presentation.ui.theme

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object OnBoardingSlider : Screen("onBoarding")
    object SignIn : Screen("signIn")
    object SignUp : Screen("signUp")
    object OtpVerification : Screen("otpVerify")
    object ResetPassword : Screen("resetPassword")
    object Home : Screen("home")
    object Profile : Screen("profile")
}

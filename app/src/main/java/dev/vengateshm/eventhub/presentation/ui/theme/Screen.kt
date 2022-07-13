package dev.vengateshm.eventhub.presentation.ui.theme

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object OnBoardingSlider : Screen("onBoarding")
    object SignIn : Screen("signIn")
    object SignUp : Screen("signUp")
    object OtpVerification : Screen("otpVerify")
    object ResetPassword : Screen("resetPassword")
    object Home : Screen("home")
    object MyProfile : Screen("myProfile")
    object Message : Screen("message")
    object Calendar : Screen("calendar")
    object Bookmark : Screen("bookmark")
    object ContactUs : Screen("contactUs")
    object Settings : Screen("settings")
    object HelpsFAQs : Screen("helpFAQs")
}

package dev.vengateshm.eventhub.presentation.onBoardingSlider

import androidx.annotation.DrawableRes
import dev.vengateshm.eventhub.R

data class OnBoardingItem(val title: String, val description: String, @DrawableRes val drawableRes: Int)

fun getOnBoardingItems(): List<OnBoardingItem> {
    return listOf(
        OnBoardingItem(
            title = "Explore Upcoming and Nearby Events",
            description = "In publishing and graphic design, Lorem is a placeholder text commonly ",
            drawableRes = R.drawable.on_boarding_1
        ),
        OnBoardingItem(
            title = "Web Have Modern Events Calendar Feature",
            description = "In publishing and graphic design, Lorem is a placeholder text commonly",
            drawableRes = R.drawable.on_boarding_2
        ),
        OnBoardingItem(
            title = "To Look Up More Events or Activities Nearby By Map",
            description = "In publishing and graphic design, Lorem is a placeholder text commonly",
            drawableRes = R.drawable.on_boarding_3
        ))
}
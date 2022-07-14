package dev.vengateshm.eventhub.domain.models

import androidx.annotation.DrawableRes

data class Event(
    val title: String,
    val location: String,
    val date: String,
    @DrawableRes val thumbImgRes: Int,
)

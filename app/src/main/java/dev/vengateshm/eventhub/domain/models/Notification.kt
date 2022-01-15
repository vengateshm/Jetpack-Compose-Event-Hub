package dev.vengateshm.eventhub.domain.models

data class Notification(
    val profilePic: Int? = null,
    val notificationUserName: String,
    val notificationMessage: String,
    val notificationType: String,
    val timeAndDate: String
)

enum class NotificationType(type: String) {
    EVENT_INVITE("event_invite"),
    OTHERS("others")
}

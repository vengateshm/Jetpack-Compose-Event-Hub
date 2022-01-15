package dev.vengateshm.eventhub.data.repositories

import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.domain.models.Notification
import dev.vengateshm.eventhub.domain.models.NotificationType
import dev.vengateshm.eventhub.domain.repositories.NotificationRepository

class NotificationRepositoryImpl : NotificationRepository {
    override fun getNotifications(): List<Notification> {
        return listOf(
            Notification(
                profilePic = R.drawable.david_silbia,
                notificationUserName = "David Silbia",
                notificationMessage = "Invite Jo Malone London’s Mother’s",
                notificationType = NotificationType.EVENT_INVITE.name,
                timeAndDate = "Just now"
            ),
            Notification(
                profilePic = R.drawable.adnan_safi,
                notificationUserName = "Adnan Safi",
                notificationMessage = " Started following you",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "5 min ago"
            ),
            Notification(
                profilePic = R.drawable.joan_baker,
                notificationUserName = "Joan Baker",
                notificationMessage = " Invite A virtual Evening of Smooth Jazz",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "20 min ago"
            ),
            Notification(
                profilePic = R.drawable.ronald_kinch,
                notificationUserName = "Ronald C. Kinch",
                notificationMessage = " Like you events",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "1 hr ago"
            ),
            Notification(
                profilePic = R.drawable.clara_tolson,
                notificationUserName = "Clara Tolson",
                notificationMessage = " Join your Event Gala Music Festival",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "9 hr ago"
            ),
            Notification(
                profilePic = R.drawable.jennifer_fritz,
                notificationUserName = "Jennifer Fritz",
                notificationMessage = " Invite you International Kids Safe",
                notificationType = NotificationType.EVENT_INVITE.name,
                timeAndDate = "Tue , 5:10 pm"
            ),
            Notification(
                profilePic = R.drawable.eric_prickett,
                notificationUserName = "Eric G. Prickett",
                notificationMessage = " Started following you",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "Wed, 3:30 pm"
            ),
            Notification(
                profilePic = R.drawable.david_silbia,
                notificationUserName = "David Silbia",
                notificationMessage = "Invite Jo Malone London’s Mother’s",
                notificationType = NotificationType.EVENT_INVITE.name,
                timeAndDate = "Just now"
            ),
            Notification(
                profilePic = R.drawable.adnan_safi,
                notificationUserName = "Adnan Safi",
                notificationMessage = " Started following you",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "5 min ago"
            ),
            Notification(
                profilePic = R.drawable.joan_baker,
                notificationUserName = "Joan Baker",
                notificationMessage = " Invite A virtual Evening of Smooth Jazz",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "20 min ago"
            ),
            Notification(
                profilePic = R.drawable.ronald_kinch,
                notificationUserName = "Ronald C. Kinch",
                notificationMessage = " Like you events",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "1 hr ago"
            ),
            Notification(
                profilePic = R.drawable.clara_tolson,
                notificationUserName = "Clara Tolson",
                notificationMessage = " Join your Event Gala Music Festival",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "9 hr ago"
            ),
            Notification(
                profilePic = R.drawable.jennifer_fritz,
                notificationUserName = "Jennifer Fritz",
                notificationMessage = " Invite you International Kids Safe",
                notificationType = NotificationType.EVENT_INVITE.name,
                timeAndDate = "Tue , 5:10 pm"
            ),
            Notification(
                profilePic = R.drawable.eric_prickett,
                notificationUserName = "Eric G. Prickett",
                notificationMessage = " Started following you",
                notificationType = NotificationType.OTHERS.name,
                timeAndDate = "Wed, 3:30 pm"
            ),
        )
    }
}
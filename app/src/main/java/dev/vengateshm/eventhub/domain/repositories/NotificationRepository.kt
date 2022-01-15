package dev.vengateshm.eventhub.domain.repositories

import dev.vengateshm.eventhub.domain.models.Notification

interface NotificationRepository {
    fun getNotifications(): List<Notification>
}
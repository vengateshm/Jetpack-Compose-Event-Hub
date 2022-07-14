package dev.vengateshm.eventhub.domain.repositories

import dev.vengateshm.eventhub.domain.models.Event

interface EventRepo {
    fun getEvents():List<Event>
}
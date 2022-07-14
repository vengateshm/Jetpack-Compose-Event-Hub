package dev.vengateshm.eventhub.data.repositories

import dev.vengateshm.eventhub.R
import dev.vengateshm.eventhub.domain.models.Event
import dev.vengateshm.eventhub.domain.repositories.EventRepo

class EventRepoImpl : EventRepo {
    override fun getEvents(): List<Event> {
        return listOf(
            Event(
                title = "Jo Malone London’s Mother’s Day Presents",
                date = "Wed, Apr 28 • 5:30 PM",
                location = "Radius Gallery • Santa Cruz, CA",
                thumbImgRes = R.drawable.event_1),
            Event(
                title = "A Virtual Evening of Smooth Jazz",
                date = "Sat, May 1 • 2:00 PM",
                location = "Lot 13 • Oakland, CA",
                thumbImgRes = R.drawable.event_2
            ),
            Event(
                title = "Women's Leadership Conference 2021",
                date = "Sat, Apr 24 • 1:30 PM",
                location = "53 Bush St • San Francisco, CA",
                thumbImgRes = R.drawable.event_3
            ),
            Event(
                title = "International Kids Safe Parents Night Out",
                date = "Fri, Apr 23 • 6:00 PM",
                location = "Lot 13 • Oakland, CA",
                thumbImgRes = R.drawable.event_4
            ),
            Event(
                title = "Collectivity Plays the Music of Jimi",
                date = "Mon, Jun 21 • 10:00 PM",
                location = "Longboard Margarita Bar",
                thumbImgRes = R.drawable.event_5
            ),
            Event(
                title = "International Gala Music Festival",
                date = "Sun, Apr 25 • 10:15 AM",
                location = "36 Guild Street London, UK",
                thumbImgRes = R.drawable.event_6
            ),
        )
    }
}
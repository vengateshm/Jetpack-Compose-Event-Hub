package dev.vengateshm.eventhub.presentation.home.drawer

import androidx.annotation.DrawableRes
import dev.vengateshm.eventhub.R

data class DrawerItem(val title: String, @DrawableRes val iconRes: Int) {
    companion object {
        fun getDrawerMenuList(): List<DrawerItem> {
            return listOf(
                DrawerItem("My Profile", R.drawable.ic_drawer_my_profile),
                DrawerItem("Message", R.drawable.ic_drawer_message),
                DrawerItem("Calendar", R.drawable.ic_drawer_calendar),
                DrawerItem("Bookmark", R.drawable.ic_drawer_bookmark),
                DrawerItem("Contact Us", R.drawable.ic_drawer_contact_us),
                DrawerItem("Settings", R.drawable.ic_drawer_settings),
                DrawerItem("Help & FAQs", R.drawable.ic_drawer_help_faqs),
                DrawerItem("Sign Out", R.drawable.ic_drawer_sign_out),
            )
        }
    }
}

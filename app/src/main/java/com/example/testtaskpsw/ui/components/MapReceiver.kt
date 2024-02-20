package com.example.testtaskpsw.ui.components

import org.osmdroid.events.MapEventsReceiver
import org.osmdroid.util.GeoPoint

class MapReceiver(
    private val onClick: (GeoPoint) -> Unit
) : MapEventsReceiver {
    override fun singleTapConfirmedHelper(p: GeoPoint?): Boolean {
        if (p != null) {
            onClick(p)
        }
        return true
    }

    override fun longPressHelper(p: GeoPoint?): Boolean {
        return true
    }
}
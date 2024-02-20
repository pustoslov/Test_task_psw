package com.example.testtaskpsw.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.testtaskpsw.R
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.MapEventsOverlay
import org.osmdroid.views.overlay.Marker
import org.osmdroid.views.overlay.Polyline

@SuppressLint("UnrememberedMutableState")
@Composable
fun OSMap() {
    var currentGeoPoint by remember {
        mutableStateOf(GeoPoint(55.755864, 37.617698))
    }
    var tracedGeoPoint by remember {
        mutableStateOf(GeoPoint(0.0, 0.0))
    }
    val ctx = LocalContext.current
    var marker: Marker
    var line by remember { mutableStateOf(Polyline()) }
    var isCentered by remember {
        mutableStateOf(false)
    }
    var isChecked by remember {
        mutableStateOf(false)
    }


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .padding(15.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(500.dp)
                    .padding(bottom = 15.dp)
            ) {
                AndroidView(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp)),
                    factory = { context ->
                        val mapView = MapView(context).apply {
                            setTileSource(TileSourceFactory.MAPNIK)
                            setMultiTouchControls(true)
                            setBuiltInZoomControls(false)
                        }
                        mapView.controller.setCenter(currentGeoPoint)
                        mapView.controller.setZoom(12.0)
                        mapView
                    },
                    update = { mapView ->

                        val mapReceiver = MapReceiver(
                            onClick = { p ->
                                if (!isChecked) {
                                    currentGeoPoint = p
                                    tracedGeoPoint = GeoPoint(0.0, 0.0)
                                } else {
                                    tracedGeoPoint = p
                                }
                            }
                        )
                        mapView.overlays.add(MapEventsOverlay(mapReceiver))

                        if (!isChecked) {
                            mapView.resetScrollableAreaLimitLatitude()
                            mapView.resetScrollableAreaLimitLongitude()

                            tracedGeoPoint = GeoPoint(0.0, 0.0)

                            line = Polyline()

                            mapView.overlays.removeIf{ element -> element is Marker }
                            mapView.overlays.removeIf{ element -> element is Polyline}
                            if (currentGeoPoint != GeoPoint(55.755864, 37.617698)) {
                                marker = Marker(mapView)
                                marker.position = currentGeoPoint
                                marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
                                marker.icon = ctx.getDrawable(R.drawable.baseline_location_on_24)
                                mapView.overlays.add(marker)
                            }
                        } else {
                            mapView.setScrollableAreaLimitLatitude(
                                mapView.mapCenter.latitude,
                                mapView.mapCenter.latitude,
                                0)
                            mapView.setScrollableAreaLimitLongitude(
                                mapView.mapCenter.longitude,
                                mapView.mapCenter.longitude,
                                0)
                            if (tracedGeoPoint != GeoPoint(0.0, 0.0)
                                && currentGeoPoint != GeoPoint(55.755864, 37.617698)) {
                                mapView.overlays.removeIf{ element -> element is Polyline}
                                line.setPoints(listOf(currentGeoPoint, tracedGeoPoint))
                                mapView.overlays.add(line)
                            }
                        }
                        mapView.controller.setZoom(mapView.zoomLevelDouble)
                        if (isCentered) {
                            mapView.controller.animateTo(currentGeoPoint)
                            isCentered = false
                        }
                    }
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp)
                        .padding(end = 7.5.dp)
                        .clickable { isCentered = true }
                        .weight(1f)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Центрировать",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp)
                        .padding(start = 7.5.dp)
                        .weight(1f)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Checkbox(
                            checked = isChecked,
                            onCheckedChange = { isChecked = !isChecked },
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                        )
                        Text(
                            text = "Фиксация",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
            }

        }



}
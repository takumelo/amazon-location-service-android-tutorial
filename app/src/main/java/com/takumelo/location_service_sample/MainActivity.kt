package com.takumelo.location_service_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amplifyframework.geo.maplibre.view.MapLibreView

class MainActivity : AppCompatActivity() {
    private val mapView by lazy {
        findViewById<MapLibreView>(R.id.mapView)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity() {

    lateinit var mapFragment: SupportMapFragment
    lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap = it


            val location1 = LatLng(-6.9203537, 107.5567494)
            googleMap.addMarker(MarkerOptions().position(location1).title("Lokasi Saya"))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1, 10f))

        })

    }
}
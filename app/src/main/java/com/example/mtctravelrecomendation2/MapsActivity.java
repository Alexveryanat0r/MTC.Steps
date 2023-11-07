package com.example.mtctravelrecomendation2;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.mtctravelrecomendation.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gmap;
    FrameLayout map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = findViewById(R.id.map);
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.gmap = googleMap;
        LatLng mapRu = new LatLng(55.751244, 37.618423);
        int delay = 1000;

        this.gmap.addMarker(new MarkerOptions().position(mapRu).title("Here"));
//        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapRu));
//        this.gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(mapRu, 10), 10000, new GoogleMap.CancelableCallback() {
//            @Override
//            public void onCancel() {
//
//            }
//
//            @Override
//            public void onFinish() {
//
//            }
//        });
    }
}
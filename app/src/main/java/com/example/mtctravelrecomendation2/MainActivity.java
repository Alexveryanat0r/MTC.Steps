package com.example.mtctravelrecomendation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.example.mtctravelrecomendation.R;
import com.google.android.gms.maps.GoogleMap;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText inputAdress;
    GoogleMap gmap;
    FrameLayout map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View search_b = findViewById(R.id.search_button);
        inputAdress = (EditText) findViewById(R.id.search_text);


        search_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.out.println(inputAdress.getText());
                String adress_str = inputAdress.getText().toString();

                Geocoder geocoder = new Geocoder(MainActivity.this, Locale.getDefault());
//                List<Address> addresses = geocoder.getFromLocationName(adress_str, 1);
//                Address address = addresses.get(0);
//                double longitude = address.getLongitude();
//                double latitude = address.getLatitude();
            }
        });

        search_b.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });
    }

    public void updateText(View view) {

    }

    public void onMapReady(@NonNull GoogleMap googleMap) {
        // Set on map current user location.
//        this.gmap = googleMap;
//        LatLng mapRu = new LatLng(55.751244, 37.618423);
//        int delay = 1000;
//
//        this.gmap.addMarker(new MarkerOptions().position(mapRu).title("Here"));
    }
}
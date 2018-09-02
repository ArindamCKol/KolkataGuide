package com.gmail.kol.c.arindam.kolkataguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        Intent intent = getIntent();
        Places place = intent.getParcelableExtra("Place");

        ImageView currentImage = findViewById(R.id.current_place_image);
        TextView currentAddress = findViewById(R.id.current_place_address);
        TextView currentTiming = findViewById(R.id.current_place_timing);

        setTitle(place.getPlacesName());
        currentImage.setImageResource(place.getPlacesImageID());
        currentAddress.setText(getString(R.string.address,place.getPlacesAddress()));
        currentTiming.setText(getString(R.string.timing,place.getPlacesTiming()));
    }
}

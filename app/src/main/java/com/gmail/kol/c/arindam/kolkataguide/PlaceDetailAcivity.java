package com.gmail.kol.c.arindam.kolkataguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlaceDetailAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        Intent intent = getIntent();
        Places place = intent.getParcelableExtra("Place");

        TextView placeNameText = findViewById(R.id.current_place_name);
        placeNameText.setText(place.getPlacesName());
    }
}

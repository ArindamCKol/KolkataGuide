package com.gmail.kol.c.arindam.kolkataguide;

import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tabNames = new ArrayList<>();
    private ArrayList<ArrayList<Places>> placesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTabNames();
        getPlaces();

        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        PlacesPagerAdapter adapter = new PlacesPagerAdapter(getSupportFragmentManager(), tabNames, placesList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void getTabNames () {
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.tab_names);

        for(int i=0; i<tempNames.length; i++) {
            tabNames.add(tempNames[i]);
        }
    }

    public void getPlaces () {
        placesList.add(getHeritagePlaces());
        placesList.add(getParkPlaces());
        placesList.add(getMuseumPlaces());
        placesList.add(getReligiouPlaces());
    }

    public ArrayList<Places> getHeritagePlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.heritage_places_name);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i]));
        }
        return tempPlaces;
    }

    public ArrayList<Places> getParkPlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.park_places_name);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i]));
        }
        return tempPlaces;
    }

    public ArrayList<Places> getMuseumPlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.museum_places_name);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i]));
        }
        return tempPlaces;
    }

    public ArrayList<Places> getReligiouPlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.religious_places_name);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i]));
        }
        return tempPlaces;
    }
}

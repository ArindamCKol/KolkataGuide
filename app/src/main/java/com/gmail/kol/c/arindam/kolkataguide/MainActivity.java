package com.gmail.kol.c.arindam.kolkataguide;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tabNames = new ArrayList<>(); // array list of tab names
    private ArrayList<ArrayList<Places>> placesList = new ArrayList<>(); // array list of array list for places type wise

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get information from xml resources
        getTabNames();
        getPlaces();

        //initialise tab & view pager
        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        PlacesPagerAdapter adapter = new PlacesPagerAdapter(getSupportFragmentManager(), tabNames, placesList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    // Get tab names from resource
    public void getTabNames () {
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.tab_names);

        for(int i=0; i<tempNames.length; i++) {
            tabNames.add(tempNames[i]);
        }
    }

    //Create a array list of array list for different types of places
    public void getPlaces () {
        placesList.add(getHeritagePlaces());
        placesList.add(getParkPlaces());
        placesList.add(getMuseumPlaces());
        placesList.add(getReligiouPlaces());
    }

    //get details of heritage places from different resource arrays
    public ArrayList<Places> getHeritagePlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.heritage_places_name);
        TypedArray tempImageID = res.obtainTypedArray(R.array.heritage_places_image);
        String [] tempAddress = res.getStringArray(R.array.heritage_places_address);
        String [] tempTiming = res.getStringArray(R.array.heritage_places_timing);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i],tempImageID.getResourceId(i,R.drawable.ic_launcher_background),tempAddress[i],tempTiming[i]));
        }
        tempImageID.recycle();
        return tempPlaces;
    }

    //get details of park places from different resource arrays
    public ArrayList<Places> getParkPlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.park_places_name);
        TypedArray tempImageID = res.obtainTypedArray(R.array.park_places_image);
        String [] tempAddress = res.getStringArray(R.array.park_places_address);
        String [] tempTiming = res.getStringArray(R.array.park_places_timing);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i],tempImageID.getResourceId(i,R.drawable.ic_launcher_background),tempAddress[i],tempTiming[i]));
        }
        tempImageID.recycle();
        return tempPlaces;
    }

    //get details of museum places from different resource arrays
    public ArrayList<Places> getMuseumPlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.museum_places_name);
        TypedArray tempImageID = res.obtainTypedArray(R.array.museum_places_image);
        String [] tempAddress = res.getStringArray(R.array.museum_places_address);
        String [] tempTiming = res.getStringArray(R.array.museum_places_timing);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i],tempImageID.getResourceId(i,R.drawable.ic_launcher_background),tempAddress[i],tempTiming[i]));
        }
        tempImageID.recycle();
        return tempPlaces;
    }

    //get details of religious places from different resource arrays
    public ArrayList<Places> getReligiouPlaces () {
        ArrayList<Places> tempPlaces = new ArrayList<>();
        Resources res = getResources();
        String [] tempNames = res.getStringArray(R.array.religious_places_name);
        TypedArray tempImageID = res.obtainTypedArray(R.array.religious_places_image);
        String [] tempAddress = res.getStringArray(R.array.religious_places_address);
        String [] tempTiming = res.getStringArray(R.array.religious_places_timing);

        for(int i=0; i<tempNames.length; i++) {
            tempPlaces.add(new Places(tempNames[i],tempImageID.getResourceId(i,R.drawable.ic_launcher_background),tempAddress[i],tempTiming[i]));
        }
        tempImageID.recycle();
        return tempPlaces;
    }
}

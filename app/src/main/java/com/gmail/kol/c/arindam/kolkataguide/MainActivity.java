package com.gmail.kol.c.arindam.kolkataguide;

import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tabNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTabNames();
        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        PlacesPagerAdapter adapter = new PlacesPagerAdapter(getSupportFragmentManager(), tabNames);
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


}

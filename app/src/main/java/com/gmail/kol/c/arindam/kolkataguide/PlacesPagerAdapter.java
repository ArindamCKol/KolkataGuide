package com.gmail.kol.c.arindam.kolkataguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PlacesPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<String> tabNames;
    private ArrayList<ArrayList<Places>> placesList;

    public PlacesPagerAdapter(FragmentManager fm, ArrayList<String> tabNames, ArrayList<ArrayList<Places>> placesList) {
        super(fm);
        this.tabNames = tabNames;
        this.placesList = placesList;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("Places",placesList.get(position));
        PlacesFragment fragment = new PlacesFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return tabNames.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabNames.get(position);
    }
}

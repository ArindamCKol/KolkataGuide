package com.gmail.kol.c.arindam.kolkataguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PlacesPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<String> tabNames;


    public PlacesPagerAdapter(FragmentManager fm, ArrayList<String> tabNames) {
        super(fm);
        this.tabNames = tabNames;
    }

    @Override
    public Fragment getItem(int position) {
/*        switch (position) {
            case 0 : return new HeritagePlacesFragment();
            case 1 : return new ParkPlacesFragment();
            case 2 : return new MuseumPlacesFragment();
            case 3 : return new ReligiousPlacesFragment();
            default: return new HeritagePlacesFragment();
        }*/
        Bundle bundle = new Bundle();
        bundle.putString("name",tabNames.get(position));
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

package com.gmail.kol.c.arindam.kolkataguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {
    private ArrayList<Places> currentPlaces = new ArrayList<>();
    private ListView placesList;

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places,container,false);

        Bundle bundle = getArguments();
        currentPlaces = bundle.getParcelableArrayList("Places");

        placesList = rootView.findViewById(R.id.places_list);
        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), R.layout.places_card, currentPlaces);
        placesList.setAdapter(adapter);

        placesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent placeDetail = new Intent(getActivity(),PlaceDetailAcivity.class);
                placeDetail.putExtra("Place", currentPlaces.get(i));
                startActivity(placeDetail);
            }
        });
        return rootView;
    }

}

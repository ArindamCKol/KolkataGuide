package com.gmail.kol.c.arindam.kolkataguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesListAdapter extends ArrayAdapter {
    private ArrayList<Places> placesList;
    public PlacesListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Places> placesList) {
        super(context, resource, placesList);
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.places_card, null);
        TextView placeNameText = view.findViewById(R.id.place_name);
        ImageView placeImage = view.findViewById(R.id.place_image);

        placeNameText.setText(placesList.get(position).getPlacesName());
        placeImage.setImageResource(placesList.get(position).getPlacesImageID());

        return view;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}

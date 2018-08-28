package com.gmail.kol.c.arindam.kolkataguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places,container,false);

        Bundle bundle = getArguments();
        TextView textView = rootView.findViewById(R.id.temp_text);
        textView.setText(bundle.getString("name"));
        return rootView;
    }

}

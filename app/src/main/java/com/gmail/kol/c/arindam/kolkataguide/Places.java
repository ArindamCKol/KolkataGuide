package com.gmail.kol.c.arindam.kolkataguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Places implements Parcelable {
    private String placesName;
    private int placesImageID;

    public Places(String placesName) {
        this.placesName = placesName;
        this.placesImageID = 0;
    }

    public Places(String placesName, int placesImageID) {
        this.placesName = placesName;
        this.placesImageID = placesImageID;
    }

    protected Places (Parcel in) {
        placesName = in.readString();
    }

    public static final Creator<Places> CREATOR = new Creator<Places>() {
        @Override
        public Places createFromParcel(Parcel in) {
            return new Places(in);
        }

        @Override
        public Places[] newArray(int size) {
            return new Places[size];
        }
    };

    public String getPlacesName() {
        return placesName;
    }

    public int getPlacesImageID() {
        return placesImageID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(placesName);
    }
}

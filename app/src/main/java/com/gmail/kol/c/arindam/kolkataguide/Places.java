package com.gmail.kol.c.arindam.kolkataguide;

import android.os.Parcel;
import android.os.Parcelable;

// Places class to hold information about place. It implement Parcelable to enable to send
// information to activities.

public class Places implements Parcelable {
    private String placesName;
    private int placesImageID;
    private String placesAddress;
    private String placesTiming;

    public Places(String placesName, int placesImageID, String placesAddress, String placesTiming) {
        this.placesName = placesName;
        this.placesImageID = placesImageID;
        this.placesAddress = placesAddress;
        this.placesTiming = placesTiming;
    }

    protected Places (Parcel in) {
        placesName = in.readString();
        placesImageID = in.readInt();
        placesAddress = in.readString();
        placesTiming = in.readString();
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

    public String getPlacesAddress() { return placesAddress; }

    public String getPlacesTiming() { return placesTiming; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(placesName);
        parcel.writeInt(placesImageID);
        parcel.writeString(placesAddress);
        parcel.writeString(placesTiming);
    }
}

package com.gmail.kol.c.arindam.kolkataguide;

public class Places {
    private String placesName;
    private int placesImageID;

    public Places(String placesName, int placesImageID) {
        this.placesName = placesName;
        this.placesImageID = placesImageID;
    }

    public String getPlacesName() {
        return placesName;
    }

    public int getPlacesImageID() {
        return placesImageID;
    }
}

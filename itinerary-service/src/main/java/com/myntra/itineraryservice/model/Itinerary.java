package com.myntra.itineraryservice.model;

import com.myntra.itineraryservice.model.clotherservice.Cloth;

import java.util.List;

public class Itinerary {
List<Cloth> cloths;

    public Itinerary() {
    }

    public Itinerary(List<Cloth> cloths) {
        this.cloths = cloths;
    }

    public List<Cloth> getCloths() {
        return cloths;
    }

    public void setCloths(List<Cloth> cloths) {
        this.cloths = cloths;
    }
}

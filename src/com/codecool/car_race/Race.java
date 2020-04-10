package com.codecool.car_race;

import java.util.ArrayList;

public class Race {
    private ArrayList<Vehicle> competitors;

    public Race() {
        this.competitors = new ArrayList<Vehicle>();
    }

    public void addCompetitor(Vehicle vehicle){
        this.competitors.add(vehicle);

    }

    public ArrayList<Vehicle> getCompetitors() {
        return competitors;
    }

    @Override
    public String toString() {
        return "Race{" +
                "competitors=" + competitors +
                '}';
    }
}

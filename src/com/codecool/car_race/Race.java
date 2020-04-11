package com.codecool.car_race;

import java.util.ArrayList;

public class Race {
    private ArrayList<Vehicle> competitors;

    public Race() {
        this.competitors = new ArrayList<Vehicle>();
    }

    public void registerRacer(Vehicle vehicle){
        this.competitors.add(vehicle);
    }

    public ArrayList<Vehicle> getCompetitors() {
        return competitors;
    }

    public void simulateRace(){
        int hour = 1;
        while (hour < 51){
//            System.out.println(hour + " LAP:");
            for(Vehicle vehicle: this.competitors){
                vehicle.moveForAnHour();
            }
            hour++;
        }
    }

    public void printRaceResults() {
        System.out.println("~~~~~~~~~~RACE RESULTS~~~~~~~~~~~~~~~");
//        for (Vehicle vehicle : this.competitors) {
////            vehicle.distanceTraveled();
//        }
        for (Vehicle vehicle : this.competitors) {
            System.out.println(vehicle);
        }
    }

    @Override
    public String toString() {
        return "Race{" +
                "competitors=" + competitors +
                '}';
    }
}

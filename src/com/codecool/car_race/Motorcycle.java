package com.codecool.car_race;

import java.util.ArrayList;

public class Motorcycle extends Vehicle {
    private String name;
    private int speed;
    private static ArrayList<Integer> motorcycleNumber = new ArrayList<Integer>();
    private int distance;

    public Motorcycle() {
        int listSize = motorcycleNumber.size();
        this.name = "Motorcycle " + (listSize + 1);
        Motorcycle.addInteger(listSize + 1);
        this.speed = 100;
        this.distance = 0;
    }

    public static  void addInteger(int number){
        motorcycleNumber.add(number);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void distanceTraveled() {
        System.out.println(this.name + " traveled in 1 hour " + this.distance + " km with the speed " + this.speed + " km/h");
    }

    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {
        this.distance += this.speed;
        distanceTraveled();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}

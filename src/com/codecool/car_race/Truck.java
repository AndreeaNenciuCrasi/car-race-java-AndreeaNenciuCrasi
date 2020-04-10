package com.codecool.car_race;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Vehicle{
    private String name;
    private int speed;
    private int distance;

    public Truck() {
        this.name = "" + ThreadLocalRandom.current().nextInt(1, 1001);
        this.speed = 100;
        this.distance = 0;
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
        return "Truck{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}

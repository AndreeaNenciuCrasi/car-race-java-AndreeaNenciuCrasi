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
        System.out.println("Truck " + this.name.toUpperCase() + " total distance: " + this.distance + " km. Last lap speed: " + this.speed + " km/h");
    }

    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {
        int breakingChance = ThreadLocalRandom.current().nextInt(0, 101);
        if (breakingChance > 5) {
            this.speed = 100;
            this.distance += this.speed;
//            distanceTraveled();
        } else {
                this.speed = 0;
                this.distance += 0;
//                distanceTraveled();
            }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}

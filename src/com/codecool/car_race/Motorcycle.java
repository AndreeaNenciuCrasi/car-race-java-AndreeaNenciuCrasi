package com.codecool.car_race;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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
        System.out.println("Motorcycle " + this.name.toUpperCase() + " total distance: " + this.distance + " km. Last lap speed: " + this.speed + " km/h");
    }

    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {
        Weather weather = new Weather();
        boolean rain = weather.isRaining();
        if (rain){
            int lowerSpeed = ThreadLocalRandom.current().nextInt(5, 51);
            this.speed = this.speed -lowerSpeed;
            if (this.speed >= 0){
                this.distance += this.speed;
            }else{
                this.speed = 0;
                this.distance += this.speed;
            }
        }
        this.distance += this.speed;
//        distanceTraveled();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}

package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Vehicle{
    private String name;
    private int speed;
    private int distance;

    public Car() {
        Random random = new Random();
        String carNames = "Dynamo Wish Blade Specter Deputy Passion Guerilla Fang Empyrean Tigress Liberty Nebula Mirage Majesty Apex Ferocity Crown Vanish Deputy Shadow";
        this.speed = ThreadLocalRandom.current().nextInt(80, 111);

        ArrayList<String> arrayWithCarNames = new ArrayList<String>(Arrays.asList(carNames.split(" ")));
        int listSize = arrayWithCarNames.size();
        int randomIndex1 = random.nextInt(listSize);
        int randomIndex2 = random.nextInt(listSize);

        this.name = arrayWithCarNames.get(randomIndex1) + " " + arrayWithCarNames.get(randomIndex2);
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

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void distanceTraveled() {
        System.out.println("Car " +this.name.toUpperCase() + " total distance: " + this.distance + " km. Last lap speed: " + this.speed + " km/h");
    }

    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {

        this.distance += this.speed;
//        distanceTraveled();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}

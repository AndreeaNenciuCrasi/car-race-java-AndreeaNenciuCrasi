package com.codecool.car_race;


import java.util.concurrent.ThreadLocalRandom;

public class Weather {

    private String setRaining(){
        int rainChance = ThreadLocalRandom.current().nextInt(0, 101);
        if (rainChance > 30) {
            return "no rain";
        } else {
            return "rain";
        }
    }

    public boolean isRaining(){
        String isRain = setRaining();
        if (isRain.equals("rain")){
            return true;
        }
        return false;
    }
}

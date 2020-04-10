package com.codecool.car_race;


public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i=1; i < 11; i++){
            Car car = new Car();
            race.addCompetitor(car);
            Motorcycle motorcycle = new Motorcycle();
            race.addCompetitor(motorcycle);
            Truck truck = new Truck();
            race.addCompetitor(truck);
        }

        System.out.println(race.getCompetitors());
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

//        race.simulateRace();
//        race.printRaceResults();

    }
}

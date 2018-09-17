package com.zingoworks.racing;

import java.util.*;

public class Process {
    private static final int BOUND_RANDOM = 10;
    private static final int JUMP = 4;
    private static final int DEFAULT_POSITION = 0;

    private String[] carName;
    private int trials;
    private Car[] cars;

    Process (String[] carName, int trials) {
        this.carName = carName;
        this.trials = trials;
        this.cars = new Car[carName.length];
    }

    public Car[] setCars() {
        for(int i = 0; i < cars.length; i++) {
            Car car = new Car(carName[i], DEFAULT_POSITION);
            this.cars[i] = car;
        }
        runByTrialsAndCars();
        return this.cars;
    }

    public void runByTrialsAndCars() {
        for (int i = 0; i < cars.length; i++) {
            runByTrials(cars[i], trials);
        }
    }

    private void runByTrials(Car car, int trials) {
        for (int i = 0; i < trials; i++) {
            runOnce(car);
        }
    }

    private void runOnce(Car car) {
        Random random = new Random();
        if (random.nextInt(BOUND_RANDOM) >= JUMP) {
            Car.updatePosition(car);
        }
    }

    public ArrayList<String> findWinner() {
        ArrayList<String> winners = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            addWinner(winners, i);
        }
        return winners;
    }

    private void addWinner(ArrayList<String> winners, int i) {
        if (Car.extractPosition(cars[i]) == Car.extractMaxposition(cars)) {
            winners.add(Car.extractNameOfCar(cars[i]));
        }
    }

    public String winner(ArrayList<String> findWinner){
        String win = "";
        for(String winners : findWinner) {
            win += winners + " ";
        }
        return win;
    }
}


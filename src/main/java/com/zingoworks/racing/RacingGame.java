package com.zingoworks.racing;

import java.util.*;

public class RacingGame {
    private static final int DEFAULT_POSITION = 0;

    private Car[] cars;

    RacingGame(String[] carName) {
        this.cars = new Car[carName.length];
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car(carName[i], DEFAULT_POSITION);
            this.cars[i] = car;
        }
    }

    public Car[] getCars() {
        return this.cars;
    }

    public void racing(int tryNo) {
        for (int i = 0; i < cars.length; i++) {
            runByTrials(cars[i], tryNo);
        }
    }

    private void runByTrials(Car car, int trials) {
        for (int i = 0; i < trials; i++) {
            car.updatePosition();
        }
    }

    public ArrayList<Car> findWinners() {
        ArrayList<Car> winners = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            addWinners(winners, cars[i]);
        }
        return winners;
    }

    private void addWinners(ArrayList<Car> winners, Car car) {
        if (checkWinner(car)) {
            winners.add(car);
        }
    }

    public String generateWinnerText(ArrayList<Car> winners) {
        String winnerText = "";
        for (Car winner : winners) {
            winnerText += winner.extractNameOfCar() + " ";
        }
        return winnerText;
    }

    public boolean checkWinner(Car car) {
        if (car.extractPosition() == extractMaxposition()) {
            return true;
        }
        return false;
    }

    public int extractMaxposition() {
        int max = 0;
        for (int i = 0; i < cars.length; i++) {
            max = cars[i].updateMaxposition(max);
        }
        return max;
    }
}


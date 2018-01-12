package com.me.racingcar;

import com.me.racingcar.car.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class RacingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int carCount = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int termCount = scanner.nextInt();

        Car[] racingCars = start(carCount, termCount);

        viewRacingResult(racingCars);

    }

    public static Car[] start(int carCount, int termCount){
        if(carCount <= 0 || termCount <= 0){
            throw new IllegalArgumentException("입력한 숫자가 잘못되었습니다.");
        }

        Car[] cars = createCar(carCount);
        for(int term = 0 ; term < termCount ; term++){
            startTerm(cars);
        }
        return cars;
    }

    private static void startTerm(Car[] cars) {
        for(Car car : cars){
            int value = getRandomValue();
            car.move(value);
        }
    }

    private static Car[] createCar(int carCount) {
        Car[] cars = new Car[carCount];
        for(int i=0 ; i<carCount ; i++){
            cars[i] = new Car("car-"+(i+1));
        }
        return cars;
    }

    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }

    private static void viewRacingResult(Car[] cars) {
        for(Car car : cars){
            System.out.println(car);
        }
    }
}

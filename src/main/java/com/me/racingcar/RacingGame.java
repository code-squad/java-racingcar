package com.me.racingcar;

import com.me.racingcar.car.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RacingGame {

    public static void main(String[] args) {
        int carCount, termCount;

        try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("자동차 대수는 몇 대 인가요?");
            carCount = Integer.parseInt(bufferRead.readLine());

            System.out.println("시도할 회수는 몇 회 인가요?");
            termCount = Integer.parseInt(bufferRead.readLine());

            start(carCount, termCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void start(int carCount, int termCount){
        if(carCount <= 0 || termCount <= 0){
            throw new IllegalArgumentException("입력한 숫자가 잘못되었습니다.");
        }

        Car[] cars = setCars(carCount);
        for(int term = 0 ; term < termCount ; term++){
            moveCars(cars);
        }

        finishGame(cars);
    }

    private static void moveCars(Car[] cars) {
        for(Car car : cars){
            int value = getRandomValue();
            car.move(value);
        }
    }

    private static void finishGame(Car[] cars) {
        for(Car car : cars){
            System.out.println(car);
        }
    }

    private static Car[] setCars(int carCount) {
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
}

package com.me.racingcar.game.racing;

import java.util.*;

public class RacingGame {
    private List<Car> cars;
    private int termCount;

    public RacingGame(int termCount){
        if(termCount <= 0){
            throw new IllegalArgumentException("게임 생성정보가 잘못되었습니다.");
        }

        this.termCount = termCount;
    }

    public RacingGame(int carCount, int termCount){
        if(carCount <= 0 || termCount <= 0){
            throw new IllegalArgumentException("게임 생성정보가 잘못되었습니다.");
        }

        createCar(carCount);
        this.termCount = termCount;
    }

    public RacingGame(String carNames, int termCount){
        if(Objects.isNull(carNames) || carNames.isEmpty() || termCount <= 0){
            throw new IllegalArgumentException("게임 생성정보가 잘못되었습니다.");
        }

        String[] names = carNames.split(",");
        if(names.length == 0){
            throw new IllegalArgumentException("게임 생성정보가 잘못되었습니다.");
        }

        createCar(names);
        this.termCount = termCount;
    }

    public static List<Car> getWinner(List<Car> cars){
        int winnerPosition = 0;
        for(Car car : cars){
            if(winnerPosition < car.getPosition()){
                winnerPosition = car.getPosition();
            }
        }

        List<Car> winner = new ArrayList<>();
        for(Car car : cars){
            if(car.getPosition() == winnerPosition){
                winner.add(car);
            }
        }
        return winner;
    }

    public static void viewResult(List<Car> cars){
        for(Car car : cars){
            System.out.println(car);
        }
    }

    public List<Car> start(){
        for(int term=0 ; term<termCount ; term++){
            goTerm();
        }
        return cars;
    }

    private void goTerm() {
        for(Car car : cars){
            int value = getRandomValue();
            car.move(value);
        }
    }

    private void createCar(int carCount) {
        cars = new ArrayList<>();
        for(int i=0 ; i<carCount ; i++){
            cars.add(new Car("car-"+(i+1)));
        }
    }
    private void createCar(String[] names){
        cars = new ArrayList<>();
        for(String name : names){
            cars.add(new Car(name));
        }
    }

    private int getRandomValue() {
        Random random = new Random();
        return random.nextInt(10);
    }

}

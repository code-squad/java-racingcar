package com.me.racingcar.game.racing;

import java.util.*;

public class RacingGame {
    private List<Car> cars;
    private int termCount;

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

    public List<Car> getWinner(){
        int winnerPosition = getWinnerPosition();
        List<Car> winner = new ArrayList<>();
        for(Car car : cars){
            if(winnerPosition == car.getPosition()){
                winner.add(car);
            }
        }
        return winner;
    }

    public void viewResult(){
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

    private int getWinnerPosition(){
        int winnerPosition = 0;
        for(Car car : cars){
            if(winnerPosition < car.getPosition()){
                winnerPosition = car.getPosition();
            }
        }

        return winnerPosition;
    }

    private void goTerm() {
        for(Car car : cars){
            int value = getRandomValue();
            car.move(value);
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

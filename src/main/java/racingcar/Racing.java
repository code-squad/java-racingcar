package racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Racing {

    ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> run(){
        InputView iv = new InputView();

        cars = iv.getCars();
        int time = iv.getTime();

        for(int i = 0 ; i < time; i++) {
            playGame();
        }

        return cars;
    }

    public void playGame() {
        Random random = new Random();

        for (Car car : cars) {
            int move = random.nextInt(10);
            car.plusMove(moveCar(move));
        }
    }

    public int moveCar(int move) {
        final int STANDARD = 4;

        if(move > STANDARD) {
            return 1;
        }
        return 0;
    }

    public static int compareScore(int score, int higher) {
        if(score > higher){
            higher = score;
        }
        return higher;
    }

    public static int findHigherScore(ArrayList<Car> cars) {
        int higher = 0;
        for (Car car : cars) {
            higher = Racing.compareScore(car.showPos(), higher);
        }
        return higher;
    }




}

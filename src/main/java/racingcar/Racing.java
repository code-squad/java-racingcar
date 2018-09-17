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

    public static int moveCar(int move) {
        final int STANDARD = 4;

        if(move > STANDARD) {
            return 1;
        }
        return 0;
    }

    public static int findHigherScore(ArrayList<Car> cars) {
        int higher = 0;
        for (Car car : cars) {
            higher = car.maxPosition(higher);
        }
        return higher;
    }

    public static ArrayList<Car> findWinners(Car[] cars) {
        ArrayList<Car> winners = new ArrayList<>();
        int maxPosition = 0;

        for(int i = 0; i < cars.length; i++) {
            maxPosition = cars[i].maxPosition(maxPosition);
        }

        for(int i = 0; i < cars.length; i++) {
            if(cars[i].isMaxPosition(maxPosition)) {
                winners.add(cars[i]);
            }
        }
        return winners;
    }

    public static String generateWinnerText(ArrayList<Car> cars) {
        String winnersText = "";
        for(int i = 0; i < cars.size() - 1; i++) {
            winnersText += cars.get(i).getName() + ",";
        }
        winnersText += cars.get(cars.size() - 1).getName();
        return winnersText;
    }
}

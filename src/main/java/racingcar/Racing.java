package racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Racing {

    public static final int STANDARD = 4;

    ArrayList<Car> cars = new ArrayList<>();

    public void run(){
        InputView iv = new InputView();

        cars = iv.getCars();
        int time = iv.getTime();

        for(int i = 0 ; i < time; i++) {
            playGame();
        }

        int higher = 0;
        for (Car car : cars) {
            higher = selectWinner(car.getPosition(), higher);
        }

        ResultView.printResult(cars);
        ResultView.printWinner(cars, higher);
    }

    public int selectWinner(int pos, int max) {
        if(pos > max){
            max = pos;
        }
        return max;
    }

    public void playGame() {
        Random random = new Random();

        for (Car car : cars) {
            int move = random.nextInt(10);
            car.plusMove(moveCar(move));
        }
    }

    public int moveCar(int move) {
        if(move > STANDARD) {
            return 1;
        }
        return 0;
    }
}

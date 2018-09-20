package racingcar.model;

import racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.Random;

public class Racing {
    private static final int Max_RANDOM_NUM = 10;
    private static final String COMMA = ",";

    private ArrayList<Car> cars = new ArrayList<>();

    public void readyGame(String inputCarsName) {
        String[] carNames = inputCarsName.split(COMMA);
        for (String carName : carNames) {
            this.cars.add(new Car(carName));
        }
    }

    public void runGame(int time) {
        for (int i = 0; i < time; i++) {
            this.playGame();
        }
        this.closeGame();
    }

    private void playGame() {
        for (Car car : this.cars) {
            car.move(this.makeRandomNum());
        }
    }

    private int makeRandomNum() {
        Random random = new Random();
        return (random.nextInt(Max_RANDOM_NUM) - 1);
    }

    public ArrayList<String> choiceWinner() {
        ArrayList<String> winners = new ArrayList<>();
        for (Car car : cars) {
            car.judgeMaxPosition();
        }
        findWinner(winners);
        return winners;
    }

    private void findWinner(ArrayList<String> winners) {
        for (Car car : cars) {
            car.compareMaxPosition(winners);
        }
    }

    private void closeGame() {
        ResultView.printResult(this.cars);
        ResultView.printWinner(this.choiceWinner());
    }
}
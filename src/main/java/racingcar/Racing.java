package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Racing {
    private static final int Max_RANDOM_NUM = 10;
    private static final String COMMA = ",";

    private ArrayList<Car> cars = new ArrayList<>();
    private int MAX_POSITION = 0;

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

    private ArrayList<String> choiceWinner() {
        ArrayList<String> winners = new ArrayList<>();
        for (Car car : cars) {
            judgeMaxPosition(car);
        }
        for (Car car : cars) {
            compareMaxPosition(winners, car);
        }
        return winners;
    }

    private void judgeMaxPosition(Car car) {
        if(car.getPosition() > MAX_POSITION) {
            MAX_POSITION = car.getPosition();
        }
    }

    private void compareMaxPosition(ArrayList<String> winners, Car car) {
        if (car.getPosition() == MAX_POSITION) {
            winners.add(car.getName());
        }
    }

    private void closeGame() {
        ResultView.printResult(this.cars);
        ResultView.printWinner(this.choiceWinner());
    }
}
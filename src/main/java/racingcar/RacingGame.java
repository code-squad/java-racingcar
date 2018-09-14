package racingcar;

import java.util.ArrayList;

public class RacingGame {
    private ArrayList<Car> cars;

    public void initCars(String[] inputName) {
        cars = new ArrayList<>();
        for (String name : inputName) {
            cars.add(new Car(name));
        }
    }

    public void run(int time) {
        for (int i = 0; i < time; i++) {
            each();
        }
    }

    private void each() {
        for (Car car : cars) {
            car.move();
        }
    }

    public ArrayList<Result> returnResult() {
        ArrayList<Result> resultList = new ArrayList<>();
        for (Car car : cars) {
            resultList.add(new Result(car.getName(), car.getPosition()));
        }
        return resultList;
    }

    public ArrayList<String> returnWinner() {
        int bestPosition = getBestPosition();
        ArrayList<String> winnerList = new ArrayList<>();
        for (Car car : cars) {
            if (car.isWinner(bestPosition)) {
                winnerList.add(car.getName());
            }
        }
        return winnerList;
    }

    public int getBestPosition() {
        int bestPosition = -1;
        for (Car car : cars) {
            bestPosition = car.comparePosition(bestPosition);
        }
        return bestPosition;
    }
}
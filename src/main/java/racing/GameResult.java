package racing;

import car.Car;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private List<Car> cars;
    private List<String> winners;

    public GameResult(List<Car> cars) {
        this.cars = cars;
        this.winners = getWinners(cars);
    }

    public static List<String> getWinners(List<Car> cars) {
        int maxScore = getMaxScore(cars);
        List<String> winners = new ArrayList<>();

        for(Car car : cars)
            tryToPutWinner(winners, car, maxScore);

        return winners;
    }

    public static int getMaxScore(List<Car> cars) {
        int maxScore = -1;
        for(Car car : cars)
            maxScore = Math.max(maxScore, car.getCurrentPosition());

        return maxScore;
    }

    public static void tryToPutWinner(List<String> winners, Car car, int maxScore) {
        if(car.isMaxPosition(maxScore))
            winners.add(car.getName());
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getWinners() {
        return winners;
    }
}

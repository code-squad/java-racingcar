package racing.result;

import racing.player.Car;

import java.util.*;

public class GameResult {
    public List<Car> cars;

    public GameResult(List<Car> cars) {
        this.cars = cars;
    }

    public static String getWinnerNames(List<Car> cars) {
        List<String> names = new ArrayList<>();
        for (Car car : getWinners(cars)) {
            names.add(car.name);
        }

        return String.join(", ", names);
    }

    public static List<Car> getWinners(List<Car> cars) {
        int bestPosition = 0;
        Map<Integer, List<Car>> ranking = new HashMap<>();

        for (Car car : cars) {
            bestPosition = getBestPosition(bestPosition, car.position);

            List<Car> rankers = getRankers(ranking.get(car.position), car);
            ranking.put(car.position, rankers);
        }

        return ranking.get(bestPosition);
    }

    protected static List<Car> getRankers(List<Car> cars, Car car) {
        if(cars == null) {
            cars = new ArrayList<>();
        }

        cars.add(car);
        return cars;
    }


    protected static int getBestPosition(int bestPosition, int position) {
        return Math.max(bestPosition, position);
    }
}

package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RacingGame {
    private final static int MIN_NUM = 4;
    private List<Car> racingCars;
    private Random random;


    public RacingGame() {
        this.racingCars = new ArrayList<>();
        this.random = new Random(System.currentTimeMillis());
    }

    private void createCars(String[] driverNames) {
        for (int i = 0; i < driverNames.length; i++) {
            this.racingCars.add(new Car(driverNames[i]));
        }
    }

    public void readyRacing(String names) {
        String[] driverNames = names.split(",");
        checkMinSize(driverNames.length);
        createCars(driverNames);
    }

    private void checkMinSize(int length) {
        if (length < 2) {
            throw new IllegalArgumentException("size가 2 이상 필요함");
        }
    }

    public List<Car> moveAll() {
        this.racingCars.forEach(car ->
                move(car, random.nextInt(10))
        );
        return this.racingCars;
    }

    public void move(Car car, int num) {
        car.move(num);
    }

    public List<String> getBestDrivers() {
        return getBestDriverNames(findBestDrivers(getMaxDistance()));
    }

    public List<String> getBestDriverNames(List<Car> bestDrivers) {
        return bestDrivers.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList());
    }


    public List<Car> findBestDrivers(int bestDistance) {
        return findBestDrivers(bestDistance, this.racingCars);
    }

    public List<Car> findBestDrivers(int bestDistance, List<Car> cars) {
        return cars.stream()
                .filter(car -> car.matchDistance(bestDistance))
                .collect(Collectors.toList());
    }


    private int getMaxDistance() {
        return this.racingCars.stream()
                .mapToInt(car -> car.getDistance())
                .max()
                .getAsInt();
    }

}

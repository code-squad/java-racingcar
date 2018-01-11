package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceVO {

    private final static int RANDOM_BOUND = 10;

    private List<RacingCar> cars;

    public RaceVO(final String[] names, final int maxMoveCount) {
        enrollCars(names);
        race(maxMoveCount);
    }

    public List<RacingCar> getCars() {
        return cars;
    }

    private void enrollCars(final String[] carNames) {
        List<RacingCar> carList = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            carList.add(new RacingCar(carNames[i]));
        }
        this.cars = carList;
    }

    private void race(final int maxMoveCount) {
        for (int i = 0; i < maxMoveCount; i++) {
            cars.forEach(car -> car.move(getRandomValue()));
        }
    }

    private int getRandomValue() {
        return new Random(System.nanoTime()).nextInt(RANDOM_BOUND);
    }
}
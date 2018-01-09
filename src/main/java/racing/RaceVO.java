package racing;

import java.util.ArrayList;
import java.util.List;

public class RaceVO {
    private List<RacingCar> cars;

    public RaceVO(final int carCount, final int maxMoveCount) {
        enrollCars(carCount);
        race(maxMoveCount);
    }

    public List<RacingCar> getCars() {
        return cars;
    }

    private void enrollCars(final int carCount) {
        List<RacingCar> carList = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            carList.add(new RacingCar());
        }
        this.cars = carList;
    }

    private void race(final int maxMoveCount) {
        cars.forEach(car -> car.move(maxMoveCount));
    }
}
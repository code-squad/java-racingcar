package racing;

import car.Car;
import util.RandomUtil;

import java.util.List;

import static util.Static.RANDOM_NUM_BOUND;

public class RacingGame {
    private int tryCount;
    private List<Car> cars;

    public RacingGame(List<Car> cars, int tryCount) {
        if(cars == null || tryCount < 0)
            throw new IllegalArgumentException("Invalid inputs");

        this.tryCount = tryCount;
        this.cars = cars;
    }

    public void playRacing() {
        for(int i = 0 ; i < tryCount ; ++i)
            tryToMoveCars();
    }

    private void tryToMoveCars() {
        for(Car car : cars)
            car.tryMove(RandomUtil.nextInt(RANDOM_NUM_BOUND));

    }

    public List<Car> getResultState() {
        return cars;
    }
}

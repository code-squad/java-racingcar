package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class RacingGame {

    private static int RANDOM_SEED = 10;

    private List<Car> carList = new ArrayList<>();
    private int tryCount;

    public RacingGame(int countOfCar, int tryCount) {
        for(int i=0; i<countOfCar; i++) {
            Car car = new Car();
            carList.add(car);
        }
        this.tryCount = tryCount;
    }


    public void racing(int tryCount, Car car) {

        for(int i = 0; i<tryCount; i++) {
            car.move(generateRandomValue(RANDOM_SEED));
        }
    }


    public static int generateRandomValue(int seed) {
        return new Random().nextInt(seed);
    }



    public void printCarsDistance() {
        for(Car car:carList) {
            ResultView.printDistanceResultEachCar(car.getDistance());
            System.out.println();
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}

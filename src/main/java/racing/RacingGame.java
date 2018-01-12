package racing;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class RacingGame {

    private static final int RANDOM_SEED = 10;
    private static final String SEPERATOR = ",";
    private List<Car> carList = new ArrayList<>();


    public RacingGame(String[] carNames) {

        for(int i=0; i<carNames.length; i++) {
            Car car = new Car(carNames[i]);
            carList.add(car);
        }
    }

    public void racing(int tryCount) {
        for(int i = 0; i<tryCount; i++) {
            moveCarList();
        }
    }

    public void moveCarList() {
        for(Car car : carList) {
            car.move(generateRandomValue(RANDOM_SEED));
        }
    }

    public static int generateRandomValue(int seed) {
        return new Random().nextInt(seed);
    }

    public void printCarsDistance() {
        for(Car car:carList) {
            ResultView.printDistanceResultEachCar(car.getName(), car.getDistance());
            System.out.println();
        }
    }

    public void printWinner() {
        ResultView.printWinner(getWinner(getMaxDistance()));
    }

    public int getMaxDistance() {
        int maxDistance = 0;
        for(Car car : carList) {
            maxDistance = Math.max(car.getDistance(), maxDistance);
        }
        return maxDistance;
    }

    public String getWinner(int maxDistance) {

        List<String> winnerNames = new ArrayList<>();

        for(Car car : carList) {
            if(car.getDistance() == maxDistance) {
                winnerNames.add(car.getName());
            }
        }
        return String.join(", ",winnerNames);
    }

    public List<Car> getCarList() {
        return carList;
    }
}

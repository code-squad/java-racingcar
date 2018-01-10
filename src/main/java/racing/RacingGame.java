package racing;

import java.util.*;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class RacingGame {

    private static final int RANDOM_SEED = 10;
    private static final String SEPERATOR = ",";
    private List<Car> carList = new ArrayList<>();
    private String winner;
    private int maxDistance=0;


    public RacingGame(String carNameList) {
        String[] carName = carNameList.split(",");
        for(int i=0; i<carName.length; i++) {
            Car car = new Car(carName[i]);
            carList.add(car);
        }
    }

    public void racing(int tryCount) {
        for(int i = 0; i<tryCount; i++) {
            moveCarList();
        }
        //레이싱이 끝나고 최고거리와 승리자 계산
        maxDistance = getMaxDistance();
        winner = getWinner(maxDistance);
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
        ResultView.printWinner(winner);
    }

    public int getMaxDistance() {
        for(Car car : carList) {
            maxDistance = Math.max(car.getDistance(), maxDistance);
        }
        return maxDistance;
    }

    public String getWinner(int maxDistance) {

        StringBuilder sb = new StringBuilder();
        for(Car car : carList) {
            if(car.getDistance() == maxDistance) {
                sb.append(car.getName()).append(SEPERATOR);
            }
        }
        int stringLength = sb.length();
        if(stringLength > 0) {
            sb.delete(stringLength - SEPERATOR.length(), stringLength);
        }
        return sb.toString();
    }

    public List<Car> getCarList() {
        return carList;
    }
}

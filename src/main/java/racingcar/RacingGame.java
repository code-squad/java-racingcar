package racingcar;

import java.util.*;

public class RacingGame {
    static final int MAXIMUM_NUM = 10;
    private Car[] cars;

    public RacingGame(String carsName) {
        this.cars = carNames(carsName.split(","));
    }

    public Car[] getCars() {
        return this.cars;
    }

    public void run(int movingCount) {
        carRandomCount(cars, movingCount);
    }

    // winner 의 name 만 string[] 으로 받아옴
    public static String[] winners(Car[] cars) {
        ArrayList<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if(car.isMaxPosition(findMax(cars))) {
                winners.add(car.getName());
            }
        }
        return winners.toArray(new String[winners.size()]);
    }

    // 최고값 찾기
    public static int findMax(Car[] car) {
        int max = 0;
        for (int i = 0; i < car.length; i++) {
            max = car[i].compareMaxPosition(max);
        }
        return max;
    }

    private static Car[] carNames(String[] names) {
        Car[] cars = new Car[names.length];
        for (int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i]);
        }
        return cars;
    }

    private static void carRandomCount(Car[] cars, int movingCount) {
        for (Car car : cars) {
            String randoms = makePositionNum(movingCount);
            increasePosition(car, randoms);
        }
    }
    private static String makePositionNum(int movingCount) {
        String carRandomNums = "";
        Random random = new Random();
        for (int i = 0; i < movingCount; i++) {
            carRandomNums += String.valueOf(random.nextInt(MAXIMUM_NUM));
        }
        return carRandomNums;
    }

    private static void increasePosition(Car car, String randoms) {
        String[] carRandomCount = randoms.split("");
        for (int i = 0; i < randoms.length(); i++) {
            car.movePosition(Integer.parseInt(carRandomCount[i]));
        }
    }
}

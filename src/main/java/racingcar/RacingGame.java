package racingcar;

import java.util.*;

public class RacingGame {
    static final int MOVE_CAR = 4;
    static final int MAXIMUM_NUM = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValue inputvalue = new InputValue();
        OutputValue outputValue = new OutputValue();

        String[] names = inputvalue.setNames(scanner).split(",");
        int movingCount = inputvalue.setMovingCount(scanner);

        Car[] cars = new Car[names.length];
        carNames(names, cars);
        carRandomCount(cars, movingCount);

        outputValue.displayGame(cars);
        outputValue.displayWinners(cars);
    }
    private static void carNames(String[] names, Car[] cars) {
        for (int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i]);
        }
    }

    private static void carRandomCount(Car[] cars, int movingCount) {
        for (Car car : cars) {
            car.setRandomCount(makePositionNum(movingCount));
            increasePosition(car);
        }
    }
    private static String makePositionNum(int movingCount) {
        String carArrays = "";
        Random random = new Random();
        for (int i = 0; i < movingCount; i++) {
            carArrays += String.valueOf(random.nextInt(MAXIMUM_NUM));
        }
        return carArrays;
    }
    //
    private static void increasePosition(Car car) {
        String[] carRandomCount = car.randomCount().split("");
        int carPosition = 0;
        for (int i = 0; i < car.randomCount().length(); i++) {
           carPosition += isIncreasePosition(carRandomCount[i]);
        }
        car.increasePosition(carPosition);
    }
    private static int isIncreasePosition(String carRandomCount)  {
        if (Integer.parseInt(carRandomCount) >= MOVE_CAR) {
            return 1;
        }
        return 0;
    }

    public static String drawDash(int carPosition) {
        String position = "";
        for (int i = 0; i < carPosition; i++) {
            position += "-";
        }
        return position;
    }


    public static String[] winners(Car[] cars) {
        ArrayList<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if(compareCar(car, findMax(cars))) {
                winners.add(car.name());
            }
        }
        return winners.toArray(new String[winners.size()]);
    }
    // 자동차 포지션값이랑 맥스값이랑 같은지 확인
    private static boolean compareCar (Car car, int max) {
        if (car.position() == max) {
            return true;
        }
        return false;
    }

    // 최고값 찾기
    private static int findMax(Car[] car) {
        int max = car[0].position();
        for (int i = 0; i < car.length; i++) {
            max = findMaxPosition(max, car[i]);
        }

        return max;
    }
    private static int findMaxPosition(int max, Car car) {
        if(car.position() > max) {
            return car.position();
        }
        return max;
    }
}

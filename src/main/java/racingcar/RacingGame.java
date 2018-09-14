package racingcar;

import java.util.*;

public class RacingGame {
    static final int MOVE_CAR = 4;
    static final int MAXIMUM_NUM = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = InputValue.setNames(scanner).split(",");
        int movingCount = InputValue.setMovingCount(scanner);

        Car[] cars =  carNames(names);
        carRandomCount(cars, movingCount);
        String[] winners = winners(cars);

        OutputValue.displayGame(cars);
        OutputValue.displayWinners(winners);
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
        String carArrays = "";
        Random random = new Random();
        for (int i = 0; i < movingCount; i++) {
            carArrays += String.valueOf(random.nextInt(MAXIMUM_NUM));
        }
        return carArrays;
    }

    private static void increasePosition(Car car, String randoms) {
        String[] carRandomCount = randoms.split("");
        for (int i = 0; i < randoms.length(); i++) {
            car.setPosition(Integer.parseInt(carRandomCount[i]));
        }
    }

    //getter 를 최대한 안써보려고 노력했는데 더 줄이는 방법을 모르겠습니다.
    //좀더 공부해보도록 하겠습니다.
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
    private static int findMax(Car[] car) {
        int max = 0;
        for (int i = 0; i < car.length; i++) {
            max = car[i].compareMaxPosition(max);
        }
        return max;
    }
}

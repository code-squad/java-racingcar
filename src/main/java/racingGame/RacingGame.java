package racingGame;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class RacingGame {


    private static final int MOVE_CONDITION = 4;
    private List<Car> cars = new ArrayList<>();
    private List<Car> winnerCars = new ArrayList<>();

    public RacingGame(String carNames) {
        if (StringUtils.isBlank(carNames)) {
            throw new IllegalArgumentException();
        }
        addCar(carNames);
    }

    private void addCar(String carNames) {
        String[] carName = carNames.split(",");
        for (int i = 0; i < carName.length; i++) {
            cars.add(new Car(carName[i]));
        }
    }


    public void moveCars(int tryNum) {
        if (tryNum < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < tryNum; i++) {
            makeCarMove();
            // 하나의 메소드는 하나의 일만해야 한다고 배웠는데
            // moveCars()는 아래의 printResult() 메소드 때문에 2가지 역할(이동, 출력)을 하고 있는데
            // printResult() 메소드를 이렇게 두는것이 맞는 걸까요?
            // 시도 회수마다 이동 흔적을 출력해야해서 이렇게 구현하긴했는데 찝찝합니다
            printTrace();
        }
    }

    private void makeCarMove() {
        for (int i = 0; i < cars.size(); i++) {
            moveCarPosition(i);
        }
    }

    private void moveCarPosition(int i) {
        if (MOVE_CONDITION <= RandomGenerator.getRandomNum()) {
            cars.set(i, cars.get(i).move());
        }
    }

    public List<Car> findWinnerCars() {
        for (Car car : cars) {
            int farthestPosition = findFarthestPosition();
            int carPosition = car.getPosition();

            if (farthestPosition == carPosition) {
                winnerCars.add(car);
            }
        }
        return winnerCars;
    }

    public int findFarthestPosition() {
        int farthestPosition = 0;
        for (Car car : cars) {
            int carPosition = car.getPosition();
            if (farthestPosition < carPosition) {
                farthestPosition = carPosition;
            }
        }
        return farthestPosition;
    }

    public void printTrace() {
        ResultView.printTrace(cars);
    }


}
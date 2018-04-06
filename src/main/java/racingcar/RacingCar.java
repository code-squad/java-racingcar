package racingcar;

import java.util.*;

public class RacingCar {

    private List<Car> carInfo;

    public RacingCar(String[] cars) {
        carInfo = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            carInfo.add(new Car(cars[i], 0));
        }
    }

    public List<Car> carPositionMove() {
        for (int i = 0; i < carInfo.size(); i++) {
            carInfo.get(i).carMove(moveCar(carInfo.get(i).returnCarMove()));
        }
        return carInfo;
    }

    private int moveCar(int carPosition) {
        return returnRandom() >= 4 ? ++carPosition : carPosition;
    }

    public int returnRandom() {
        return (new Random().nextInt(9));
    }

}
package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarsInfo {

    private List<Car> carsInfo;

    private CarsInfo(List<Car> carsInfo) {
        if (carsInfo == null || carsInfo.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.carsInfo = carsInfo;
    }

    public static CarsInfo makeRacingCarInfo(String[] carNames) {
        if (carNames == null || carNames.length == 0) {
            throw new IllegalArgumentException();
        }

        return initRacingCarInfoByCarNames(carNames);
    }

    private static CarsInfo initRacingCarInfoByCarNames(String[] carNames) {
        List<Car> carsInfo = new ArrayList<>();
        int carNamesSize = carNames.length;
        for (int i = 0; i < carNamesSize; i++) {
            carsInfo.add(new Car(carNames[i], 0));
        }

        return new CarsInfo(carsInfo);
    }

    public void moveRacingCars() {
        for (int i = 0; i < carsInfo.size(); i++) {
            carsInfo.get(i).carMove(returnRandom());
        }
    }

    public int returnRandom() {
        return (new Random().nextInt(9));
    }

    public int searchWinningPosition() {
        int winningPosition = 0;
        for (Car car : carsInfo) {
            winningPosition = car.compareWinningNumberWithCarMove(winningPosition);
        }
        return winningPosition;
    }

    public String[] makeWinnerNames(int winningPosition) {
        List<String> winnerNames = new ArrayList<>();
        for (Car car : carsInfo) {
            addWinnerNames(winnerNames, winningPosition, car);
        }
        return winnerNames.toArray(new String[winnerNames.size()]);
    }

    private void addWinnerNames(List<String> winnerNames, int winnerValue, Car car) {
        if (car.isEqualsWinningPosition(winnerValue)) {
            winnerNames.add(car.getCarName());
        }
    }

    public int getCarsInfoSize() {
        return carsInfo.size();
    }

    public Car findCarByIndex(int index) {
        return carsInfo.get(index);
    }

}

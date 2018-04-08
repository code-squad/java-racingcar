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
            carInfo.get(i).carMove(returnRandom());
        }
        return carInfo;
    }

    public int returnRandom() {
        return (new Random().nextInt(9));
    }

    public String searchWinner() {
        return returnWinner(carInfo);
    }

    public String returnWinner(List<Car> carInfo) {
        return returnWinnerString(searchWinnerValue(carInfo), carInfo);
    }

    private String returnWinnerString(int winnerValue, List<Car> carInfo) {
        return String.join(", ", makeWinnerString(winnerValue, carInfo));
    }

    private String[] makeWinnerString(int winnerValue, List<Car> carInfo) {
        List<String> winnerNames = new ArrayList<>();
        for (Car car : carInfo) {
            addWinnerNames(winnerNames, winnerValue, car);
        }
        return winnerNames.toArray(new String[winnerNames.size()]);
    }

    private void addWinnerNames(List<String> winnerNames, int winnerValue, Car car) {
        if (winnerValue == car.getCarMove()) {
            winnerNames.add(car.getCarName());
        }
    }

    private int searchWinnerValue(List<Car> carInfo) {
        int winnerValue = 0;
        for (int i = 0; i < carInfo.size(); i++) {
            winnerValue = compareWinnerCarPosition(winnerValue, carInfo.get(i).getCarMove());
        }
        return winnerValue;
    }

    private int compareWinnerCarPosition(int winnerValue, int compareValue) {
        return winnerValue < compareValue ? compareValue : winnerValue;
    }

}
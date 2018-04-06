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
            carInfo.get(i).move = moveCar(carInfo.get(i).move);
        }
        return carInfo;
    }

    private int moveCar(int carPosition) {
        return returnRandom() >= 4 ? ++carPosition : carPosition;
    }

    public int returnRandom() {
        return (new Random().nextInt(9));
    }

    public String returnWinner() {
        return returnWinnerString(searchWinnerValue());
    }

    private String returnWinnerString(int winnerValue) {
        String winner = "";
        for (int i = 0; i < carInfo.size(); i++) {
            winner += makeWinnerString(winnerValue, carInfo.get(i).move, carInfo.get(i).carName);
        }
        return removeLastComma(winner);
    }

    private String removeLastComma(String winner) {
        return winner.substring(0, winner.length() - 2);
    }

    private String makeWinnerString(int winnerValue, int compareValue, String winnerName) {
        return winnerValue == compareValue ? appendComma(winnerName) : "";
    }

    private String appendComma(String winnerName) {
        return winnerName + ", ";
    }

    private int searchWinnerValue() {
        int winnerValue = 0;
        for (int i = 0; i < carInfo.size(); i++) {
            winnerValue = compareWInnerCarPosition(winnerValue, carInfo.get(i).move);
        }
        return winnerValue;
    }

    private int compareWInnerCarPosition(int winnerValue, int compareValue) {
        return winnerValue < compareValue ? compareValue : winnerValue;
    }

}
package racingcar;

import java.util.List;

public class OutputRacingCarView {

    public static void printCarPosition(List<Car> carInfo) {
        for (int i = 0; i < carInfo.size(); i++) {
            System.out.println(printCarMove(carInfo.get(i).returnCarName(), carInfo.get(i).returnCarMove()));
        }
    }

    public static String printCarMove(String carName, int carPosition) {
        carName += " : ";
        for (int j = 0; j < carPosition; j++) {
            carName += "-";
        }
        return carName;
    }

    public static void printWinner(List<Car> carInfo) {
        System.out.println(searchWinner(carInfo) + "가 최종 우승했습니다.");
    }

    public static String searchWinner(List<Car> carInfo) {
        return returnWinner(carInfo);
    }

    public static String returnWinner(List<Car> carInfo) {
        return returnWinnerString(searchWinnerValue(carInfo), carInfo);
    }

    private static String returnWinnerString(int winnerValue, List<Car> carInfo) {
        String winner = "";
        for (int i = 0; i < carInfo.size(); i++) {
            winner += makeWinnerString(winnerValue, carInfo.get(i).returnCarMove(), carInfo.get(i).returnCarName());
        }
        return removeLastComma(winner);
    }

    private static String removeLastComma(String winner) {
        return winner.substring(0, winner.length() - 2);
    }

    private static String makeWinnerString(int winnerValue, int compareValue, String winnerName) {
        return winnerValue == compareValue ? appendComma(winnerName) : "";
    }

    private static String appendComma(String winnerName) {
        return winnerName + ", ";
    }

    private static int searchWinnerValue(List<Car> carInfo) {
        int winnerValue = 0;
        for (int i = 0; i < carInfo.size(); i++) {
            winnerValue = compareWinnerCarPosition(winnerValue, carInfo.get(i).returnCarMove());
        }
        return winnerValue;
    }

    private static int compareWinnerCarPosition(int winnerValue, int compareValue) {
        return winnerValue < compareValue ? compareValue : winnerValue;
    }

}
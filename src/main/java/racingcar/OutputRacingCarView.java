package racingcar;

import java.util.List;

public class OutputRacingCarView {

    public static void printCarPosition(List<Car> carInfo) {
        for (int i = 0; i < carInfo.size(); i++) {
            System.out.println(printCarMove(carInfo.get(i).getCarName(), carInfo.get(i).getCarMove()));
        }
    }

    public static String printCarMove(String carName, int carPosition) {
        carName += " : ";
        for (int j = 0; j < carPosition; j++) {
            carName += "-";
        }
        return carName;
    }

    public static void printWinner(String winnerNames) {
        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }

}
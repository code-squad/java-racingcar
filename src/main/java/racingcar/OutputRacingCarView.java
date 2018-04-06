package racingcar;

import java.util.List;

public class OutputRacingCarView {

    public static void printRacing(RacingCar racingCar, int move) {
        for (int i = 0; i < move; i++) {
            printCarPosition(racingCar.carPositionMove());
            System.out.println();
        }
    }

    public static void printCarPosition(List<Car> carInfo) {
        for (int i = 0; i < carInfo.size(); i++) {
            System.out.println(printCarMove(carInfo.get(i).carName, carInfo.get(i).move));
        }
    }

    public static String printCarMove(String carName, int carPosition) {
        carName += " : ";
        for (int j = 0; j < carPosition; j++) {
            carName += "-";
        }
        return carName;
    }

    public static void printWinner(RacingCar racingCar) {
        System.out.println(searchWinner(racingCar) + "가 최종 우승했습니다.");
    }

    public static String searchWinner(RacingCar racingCar) {
        return racingCar.returnWinner();
    }
}
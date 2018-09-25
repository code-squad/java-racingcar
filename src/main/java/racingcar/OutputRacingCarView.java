package racingcar;

public class OutputRacingCarView {

    public static void printCarPosition(Racing racing) {
        int carsInfoSize = racing.getCarsInfoSize();
        for (int i = 0; i < carsInfoSize; i++) {
            System.out.println(printCarMove(racing.findCarNameByIndex(i), racing.findCarMoveByIndex(i)));
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
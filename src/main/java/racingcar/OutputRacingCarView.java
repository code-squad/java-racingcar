package racingcar;

public class OutputRacingCarView {

    public static void printRacing(RacingCar racingCar, int move) {
        for (int i = 0; i < move; i++) {
            printCarPosition(racingCar.carPositionMove());
            System.out.println();
        }
    }

    public static void printCarPosition(int[] carPositions) {
        for (int i = 0; i < carPositions.length; i++) {
            printCarMove(carPositions[i]);
            System.out.println();
        }
    }

    public static void printCarMove(int carPosition) {
        for (int j = 0; j < carPosition; j++) {
            System.out.print("-");
        }
    }

}
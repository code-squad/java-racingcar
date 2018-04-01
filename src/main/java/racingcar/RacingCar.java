package racingcar;

public class RacingCar {

    private static int[] carPosition;

    public static void racing(int car, int move) {
        if(car <= 0 || move <= 0) {
            throw new IllegalArgumentException();
        }

        carPosition = new int[car];

        for(int i = 0 ; i<move; i++){
            carPositionMove();
            nextLinePrint();
        }
    }

    private static void carPositionMove() {
        for(int j = 0; j<carPosition.length; j++) {
            if(moveCar()) {
                ++carPosition[j];
            }
            moveCarPrint(carPosition[j]);
            nextLinePrint();
        }
    }

    private static boolean moveCar() {
        return (((int) (Math.random() * 9) >= 4) ? true : false);
    }

    private static void moveCarPrint(int printCount) {
        for(int i = 0; i<printCount; i++) {
            System.out.print("-");
        }
    }

    private static void nextLinePrint() {
        System.out.println();
    }
}

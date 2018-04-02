package racingcar;

import java.util.Random;
import java.util.Scanner;

public class Racingcar {

    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int[] carPosition = new int[scanner.nextInt()];

        System.out.println("시도할 회수는 몇 회 인가요?");
        int time = scanner.nextInt();

        carRacingStart(carPosition,time,new RacingCarView());
    }

    public static void carRacingStart(int[] carPosition, int carRacingTry, RacingCarView racingCarView) {
        for(int i = 0; i < carRacingTry; i++) {
            choiceMovingCar(carPosition);
            racingCarView.printCarRoutes(carPosition);
        }
    }

    public static void choiceMovingCar(int[] carPosition) {
        for(int j = 0; j < carPosition.length; j++) {
          if(isGetMoreThanFiveNum()) {
            moveCar(carPosition,j);
          }
        }
    }

    public static boolean isGetMoreThanFiveNum() {
        return random.nextInt(10) > 4;
    }

    public static void moveCar(int[] carPosition,int moveNum) {
        carPosition[moveNum] += 1;
    }
}

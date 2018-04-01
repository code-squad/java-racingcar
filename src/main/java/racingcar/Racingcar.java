package racingcar;

import java.util.Random;
import java.util.Scanner;

public class Racingcar {

    private static Random random = new Random();
    private static final String route = "-";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int carNum = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int carRacingTry = scanner.nextInt();

        StringBuilder[] carRoute = null;
        carRoute = initialCarRoute(carRoute,carNum);
        carRacingStart(carRoute, carNum, carRacingTry);
    }

    public static StringBuilder[] initialCarRoute(StringBuilder[] carRoute, int carNum) {
        carRoute = new StringBuilder[carNum];
        for(int i = 0; i < carRoute.length; i++) {
            carRoute[i] = new StringBuilder();
        }

        return carRoute;
    }

    public static void carRacingStart(StringBuilder[] carRoute, int carNum, int carRacingTry) {
        for(int i = 0; i < carRacingTry; i++) {
            choiceMovingCar(carRoute,carNum);
            printCarRoute(carRoute);
        }
    }

    private static void choiceMovingCar(StringBuilder[] carRoute, int carNum) {
        for(int j = 0; j < carNum; j++) {
          if(isGetMoreThanFiveNum()) {
            moveCar(carRoute[j]);
          }
        }
    }

    public static boolean isGetMoreThanFiveNum() {
        return random.nextInt(10) > 4;
    }

    public static void moveCar(StringBuilder carRoute) {
        carRoute.append(route);
    }

    private static void printCarRoute(StringBuilder[] carRoute) {
        for(StringBuilder singleCarRoute:carRoute) {
            System.out.println(singleCarRoute);
        }
        System.out.println();
    }

}

package view;

import car.Car;
import car.GameInfo;

import java.util.ArrayList;

public class ResultView {
    public static int MAX_NUM = 0;

    public static void totalPrint(GameInfo GameInfo) {
        Car[] cars = GameInfo.getCars();
        printResult(cars);
        checkWinner(cars);
    }

    // 자동차의 이름과 차의 위치를 표시 한 메소드
    public static void printResult(Car[] cars) {
        System.out.println("실행결과");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i].getName() + " : ");
            printDash(cars[i].getCarPosition());
            System.out.println("");
        }
    }

    // 자동차 위치 대쉬 - 로 표시 할 메소드
    public static void printDash(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("-");
        }
    }

    public static ArrayList<String> winners(Car[] cars) {
        int max = winner(cars);
        ArrayList<String> winnerName = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (max == cars[i].getCarPosition()) {
                winnerName.add(cars[i].getName());
            }
        }
        return winnerName;
    }

    public static void checkWinner(Car[] cars) {
        System.out.print("final winner : ");
        ArrayList<String> win = winners(cars);
        for (int i = 0; i < win.size(); i++) {
            System.out.print(win.get(i) + ",");
        }
    }

    public static int winner(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (MAX_NUM < cars[i].getCarPosition()) {
                MAX_NUM = cars[i].getCarPosition();
            }
        }
        return MAX_NUM;
    }
}

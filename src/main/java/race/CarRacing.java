package race;

import java.util.*;

public class CarRacing {
    private static final int jumpValue = 4;
    private static final String resultString = "-";
    private int time;
    private int[] carPositions;

    public static void main(String[] args) {
        CarRacing game = new CarRacing();
        game.input();
        game.run();
        game.valueArray();
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCar = scan.nextInt();
        carPositions = new int[numberOfCar];
        System.out.println("시도할 회수는 몇 회 인가요?");
        time = scan.nextInt();
    }

    public void run() {
        for (int i = 0; i < time; i++) {
            go();
        }
    }


    public void go() {
        for (int j = 0; j < carPositions.length; j++) {
            check(j);
        }
    }


    public void check(int j) {
        Random rnd = new Random();
        if (rnd.nextInt(10) >= jumpValue) {
            carPositions[j]++;
        }
    }


    public void valueArray() {
        for (int k = 0; k < carPositions.length; k++) {
            valuePrint(k);
            System.out.println();
        }
    }

    public void valuePrint(int k) {
        for (int i = 0; i < carPositions[k]; i++) {
            System.out.print(resultString);
        }
    }


}

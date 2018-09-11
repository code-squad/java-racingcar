package race;

import java.util.*;

public class CarRacing {
    private int time;
    private int[] carPositions;

    public static void main(String[] args) {
        CarRacing game = new CarRacing();
        game.input();
        game.run();
        game.valuePrint();
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
        Random rnd = new Random();
        for (int j = 0; j < carPositions.length; j++) {
            if (rnd.nextInt(10) >= 4) {
                carPositions[j]++;
            }
        }
    }


    public void valuePrint() {
        for (int k = 0; k < carPositions.length; k++) {
            for (int l = 0; l < carPositions[k]; l++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

package racingcar;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {
    private int time;
    private int[] carPositions;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCar = sc.nextInt();
        carPositions = new int[numberOfCar];
        System.out.println("시도할 회수는 몇 회 인가요?");
        time = sc.nextInt();
        Random rnd = new Random();

        for (int i = 0; i < time; i++) {
            for (int j = 0; j < carPositions.length; j++) {
                if (rnd.nextInt(10) >= 4) {
                    carPositions[j]++;
                }
            }
        }

        for (int k = 0; k < carPositions.length; k++) {
            for (int l = 0; l < carPositions[k]; l++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        game.run();
    }
}
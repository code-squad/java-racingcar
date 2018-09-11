package racingcar;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {
    private static Random rnd = new Random();
    private int time;
    private int[] carPositions;

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        game.getInput();
        game.run();
        game.printResult();
    }

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCar = sc.nextInt();
        carPositions = new int[numberOfCar];
        System.out.println("시도할 회수는 몇 회 인가요?");
        time = sc.nextInt();
        sc.close();
    }

    public void run() {
        iterate(time);
    }

    private void iterate(int time) {
        for (int i = 0; i < time; i++) {
            each();
        }
    }

    private void each() {
        for (int carIndex = 0; carIndex < carPositions.length; carIndex++) {
            move(carIndex);
        }
    }

    private void move(int carIndex) {
        if (rnd.nextInt(10) >= 4) {
            carPositions[carIndex]++;
        }
    }

    public void printResult() {
        for (int carIndex = 0; carIndex < carPositions.length; carIndex++) {
            printACarPosition(carIndex);
        }
    }

    private void printACarPosition(int carIndex) {
        int position = carPositions[carIndex];
        for (int l = 0; l < position; l++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
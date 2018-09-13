package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingGame {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        output(time(makeCar()));
    }

    public static int[] makeCar(){
        System.out.println("자동차 대수는 몇 대 인가요?");

        int[] carPositions = new int[s.nextInt()];
        return carPositions;
    }

    public static int[] time(int[] carPositions) {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = s.nextInt();
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] = 0;
            moveRanCreate(carPositions, count, i);
        }
        return carPositions;
    }

    public static void moveRanCreate(int [] carPositions, int count, int i) {
        Random rnd = new Random();
        for (int j = 0; j < count; j++) {
            run(carPositions, rnd.nextInt(10), i);
        }
    }

    public static void run(int [] carPositions, int move, int i){
        if (move >= 4)
            carPositions[i] += 1;
    }

    public static void output(int[] carPositions){
        for (int i = 0; i < carPositions.length; i++) {
            carDist(carPositions, i);
            finishLine(carPositions, i);
        }
    }

    private static void carDist(int[] carPositions, int i) {
        for (int j = 0; j < carPositions[i]; j++) {
            System.out.print("-");
        }
    }

    private static void finishLine(int[] carPositions, int i) {
        if(i < carPositions.length -1)
            System.out.println();
    }
}


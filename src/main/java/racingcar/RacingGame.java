package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingGame {

    public static void main(String[] args) {
        int[] carPositions = makeCar();
        run(carPositions);
    }

    public static int[] makeCar(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        Scanner s = new Scanner(System.in);
        int carNum = s.nextInt();
        int[] carPositions = new int[carNum];
        return carPositions;
    }

    public static void run(int[] carPositions) {
        Scanner s = new Scanner(System.in);
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = s.nextInt();
        Random rnd = new Random();
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] = 0;
            for (int j = 0; j < count; j++) {
                int move = rnd.nextInt(10);
                if (move >= 4)
                    carPositions[i] += 1;
            }
        }
        output(carPositions);
    }


    public static void output(int[] carPositions){
        for (int i = 0; i < carPositions.length; i++) {
            for (int j = 0; j < carPositions[i]; j++) {
                System.out.print("-");
            }
            if(i < carPositions.length -1)
                System.out.println();
        }
    }
}


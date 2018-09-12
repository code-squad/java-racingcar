package step1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class racingcar {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int car = 0;
        int carmove[] = new int[3];

        car = carNumber();
        carmove = moveNumber();

        System.out.println("************");
        for (int i = 0; i < car; i++) {
            moveRandom(carmove);
            out(carmove);
            System.out.println();
        }
    }

    static int carNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        int car = s.nextInt();

        return car;
    }

    static int[] moveNumber() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int[] action = new int[s.nextInt()];

        return action;
    }

    static int[] moveRandom(int[] carmove) {
        Random r = new Random();
        for (int i = 0; i < carmove.length; i++) {
            carmove[i] = r.nextInt(9);
        }

        //     System.out.println(Arrays.toString(carmove)); ->확인용
        return carmove;
    }

    static void out(int[] carmove) {
        for (int i = 0; i < carmove.length; i++) {
            if (carmove[i] >= 4) {
                System.out.print("-");
            } else {
                System.out.print("");
            }
        }
    }
}
package step2;

import java.util.Scanner;

public class RacingCar {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Movement Mm = new Movement();
        Mm.out();
    }

    static int carNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return s.nextInt();
    }

    static int[] moveNumber() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int[] action = new int[s.nextInt()];
        return action;
    }
}
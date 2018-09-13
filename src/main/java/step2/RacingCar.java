package step2;

import java.util.Random;
import java.util.Scanner;

public class RacingCar {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int carMove[];
        int car = carNumber();

        carMove = moveNumber();

        System.out.println("************");
        for (int i = 0; i < car; i++) {
            moveRandom(carMove);
            out(carMove);
            System.out.println();
        }
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

    static int[] moveRandom(int[] carMove) {
        Random r = new Random();
        for (int i = 0; i < carMove.length; i++) {
            carMove[i] = r.nextInt(9);
        }

        //System.out.println(Arrays.toString(carMove));     //랜덤값 확인용
        return carMove;
    }

    static void out(int[] carMove) {
        for (int i = 0; i < carMove.length; i++) {
            repetition(carMove[i]);
        }
    }

    private static void repetition(int i) {
        if (i >= 4) {
            System.out.print("-");
        }
    }
}
package step2;

import java.util.Random;
import java.util.Scanner;

public class Movement {
    static Scanner s = new Scanner(System.in);

    int car = 0;
    int[] carMove = new int[0];

    public int carNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return car = s.nextInt();
    }

    public int[] moveNumber() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        carMove = new int[s.nextInt()];
        return carMove;
    }

    public void out() {
        System.out.println("***********");
        System.out.println("차 입력값" + car);
        for (int i = 0; i < car; i++) {
            run();
            System.out.println();
        }
    }

    public int[] moveRandom() {
        Random r = new Random();
        for (int i = 0; i < carMove.length; i++) {
            carMove[i] = r.nextInt(9);
        }
        return carMove;
    }

    public void run() {
        for (int i = 0; i < carMove.length; i++) {
            repetition(carMove[i]);
            moveRandom();
        }
    }

    private void repetition(int i) {
        if (i >= 4) {
            System.out.print("-");
        }
    }
}

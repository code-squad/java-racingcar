package racingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class RacingGame {

    private static List<Integer> carPosition = new ArrayList<>();


    public static void racing(int carNum) {

        for (int i = 0; i < carNum; i++) {
            if (isMove(getRandomNum())) {
                carPosition.add(i, carPosition.remove(i) + 1);
                display(carPosition.get(i));
                continue;
            }
            display(carPosition.get(i));
        }

        System.out.println();
    }

    public static int getRandomNum() {

        Random random = new Random();
        return random.nextInt(10);

    }

    public static void display(int carPosition) {

        for (int i = 0; i < carPosition; i++)
            System.out.print("-");

        System.out.println();

    }

    public static boolean isMove(int val) {

        if (val >= 4) {
            return true;
        }
        return false;
    }


    public static int getCarNum() {
        System.out.print("자동차 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int carNum = sc.nextInt();

        if (carNum < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < carNum; i++) {
            carPosition.add(0);
        }
        return carNum;
    }

    public static int getTryCount() {
        System.out.print("시도 횟수를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        int tryCnt = sc.nextInt();
        if (tryCnt < 0) {
            throw new IllegalArgumentException();
        }
        return tryCnt;
    }

    public static void main(String[] args) {

        try {
            int carNum = getCarNum();
            int tryCnt = getTryCount();

            for (int i = 0; i < tryCnt; i++) {
                RacingGame.racing(carNum);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("숫자를 제대로 입력해주세요.");
        }

    }
}

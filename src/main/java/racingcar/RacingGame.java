package racingcar;

import java.util.Random;
import java.util.Scanner;

public class RacingCar {

    private int countOfCar;
    private int countOfTestCase;
    private static Random random;

    static {
        random = new Random();
    }

    void initDisplay () {
        inputData();
        random.nextInt();
    }

    private void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        countOfCar = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        countOfTestCase = sc.nextInt();
    }


}

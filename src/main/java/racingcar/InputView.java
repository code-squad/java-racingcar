package racingcar;

import java.util.Scanner;

public class InputView {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static int inputCountOfCar() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return sc.nextInt();
    }

    public static int inputTestCase() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }
}

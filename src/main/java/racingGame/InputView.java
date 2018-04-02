package racingGame;

import java.util.Scanner;

/**
 * Created by hongjong-wan on 2018. 4. 3..
 */
public class InputView {

    public static int getCarNum(Scanner sc) {
        System.out.println("자동차 수는 몇대 인가요?");
        return sc.nextInt();
    }

    public static int getTryNum(Scanner sc) {
        System.out.println("시도 회수는 몇회 인가요?");
        return sc.nextInt();
    }
}

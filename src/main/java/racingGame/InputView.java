package racingGame;

import java.util.Scanner;

/**
 * Created by hongjong-wan on 2018. 4. 3..
 */
public class InputView {

    public static String getCarNames(Scanner sc) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return sc.nextLine();
    }

    public static int getTryNum(Scanner sc) {
        System.out.println("시도 회수는 몇회 인가요?");
        return sc.nextInt();
    }
}

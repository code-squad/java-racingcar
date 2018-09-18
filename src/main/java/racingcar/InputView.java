package racingcar;

import java.util.Scanner;

public class InputView {

    public static Scanner scanner = new Scanner(System.in);

    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.next();
        return carNames;
    }

    public static int getTryNo() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int tryNo = scanner.nextInt();
        return tryNo;
    }
}

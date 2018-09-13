package racingcar;

import java.util.Scanner;

public class InputValue {

    public void InputValue() {

    }

    public static int setMovingCount(Scanner scanner) {
        System.out.println("시도할 횟수는 몇번인가요?");
        return scanner.nextInt();
    }

    public static String setNames(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return scanner.nextLine();
    }

}

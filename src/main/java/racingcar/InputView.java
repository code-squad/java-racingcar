package racingcar;

import java.util.Scanner;

public class InputView {

    private static Scanner s = new Scanner(System.in);

    public static String input() {           //이름 배정
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String car = s.next();
        return car;
    }

    public static int moveNumber() {          //동작 횟수
        System.out.println("시도할 회수는 몇회인가요?");
        int time = s.nextInt();
        System.out.println();
        return time;
    }
}

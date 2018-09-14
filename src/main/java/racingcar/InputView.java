package racingcar;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    //자동차 이름 입력 받기
    public static String[] inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] names = sc.nextLine().split(",");
        return names;
    }

    //시도 회수 입력 받기
    public static int getTryNum() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }
}

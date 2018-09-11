package racingcar;

import java.util.Scanner;

public class InputView {
    String carNames;
    int time;

    public void userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        carNames = scan.next();
        System.out.println("시도할 회수는 몇 회 인가요?");
        time = scan.nextInt();
        System.out.println();
    }

}

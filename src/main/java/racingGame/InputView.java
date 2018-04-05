package racingGame;

import java.util.List;
import java.util.Scanner;

public class InputView {
    static String getCarNames() {
        Scanner scan = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scan.next();
    }
    
    static int getTryNo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("시도할 회수는 몇 회 인가요?: ");
        return scan.nextInt();
    }

}

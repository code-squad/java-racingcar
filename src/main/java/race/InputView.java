package race;

import java.util.Scanner;

public class InputView {


    public static String inputName(Scanner scan) {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)를 기준으로 구분).");
        return scan.next();
    }

    public static int inputCount(Scanner scan) {
        System.out.println("시도할 횟수는 몇회 인가요?");
        int tryCount = scan.nextInt();
        if(tryCount<=0) {
            return inputCount(scan);
        }
        return tryCount;
    }



}

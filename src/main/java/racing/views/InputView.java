package racing.views;

import java.util.Scanner;

public class InputView {

    public static String carNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return getNextLine();
    }

    public static int getTryNo() {
        System.out.println("시도 회수는 몇회 인가요? ?");
        return getNextInt();
    }

    private static int getNextInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getNextLine() {
        return new Scanner(System.in).nextLine();
    }
}

package racing;

import java.util.Scanner;

public class InputView {

    public static int getCarNo() {
        System.out.println("자동차 댓수는 몇대인가요 ?");
        return getNextInt();

    }

    public static int getTryNo() {
        System.out.println("시도 회수는 몇회 인가요? ?");
        return getNextInt();
    }

    private static int getNextInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

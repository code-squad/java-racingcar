package racing;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public static int getCarNo() {
        System.out.println("자동차 댓수는 몇대인가요 ?");
        return scanner.nextInt();
    }

    public static int getTryNo() {
        System.out.println("자동차 댓수는 몇대인가요 ?");
        return scanner.nextInt();
    }
}

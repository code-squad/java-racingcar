package game;

import java.util.Scanner;

public class InputView implements View {

    private static Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }

    public static int getCarNo() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public static int getTryNo() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}

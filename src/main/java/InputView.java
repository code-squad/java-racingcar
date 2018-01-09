import java.util.Scanner;

/**
 * Created by hoon on 2018. 1. 9..
 */
public class InputView {
    static Scanner scanner = new Scanner(System.in);

    public static Integer readCarNum() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public static Integer readRaceNum() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

}

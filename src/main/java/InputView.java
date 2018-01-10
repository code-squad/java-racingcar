import java.util.Scanner;

/**
 * Created by hoon on 2018. 1. 9..
 */
public class InputView {
    static Scanner scanner = new Scanner(System.in);

    public static String readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public static Integer readRaceNum() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

}
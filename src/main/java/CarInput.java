import java.util.Scanner;

public class CarInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String getNames() {
        System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)\n>>");
        return scanner.nextLine();
    }

    public static int getTimes() {
        System.out.println("시도할 횟수는 몇 회 인가요?\n>>");
        return scanner.nextInt();
    }
}

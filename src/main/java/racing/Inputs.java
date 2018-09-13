package racing;

import java.util.Scanner;

public class Inputs {
    static final String SPLIT_STANDARD = ",";
    static Scanner sc = new Scanner(System.in);

    Inputs() {

    }

    public static int getTime() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }

    public static String[] getCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return sc.next().split(SPLIT_STANDARD);
    }

    public static void close() {
        sc.close();
    }

}
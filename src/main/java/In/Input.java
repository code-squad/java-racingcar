package In;

import java.util.Scanner;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2018-01-09
 */
public class Input {
    private static Scanner scan = new Scanner(System.in);

    public void createScan(){
        scan = new Scanner(System.in);
    }

    public static String inputCars(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scan.next();
    }

    public static int inputTryNumber(){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scan.nextInt();
    }

    public static void scanClose(){
        scan.close();
    }
}

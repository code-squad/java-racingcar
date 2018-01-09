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

    public static int inputCarSize(){
        System.out.println("자동차 대수는 몇 대인가?");
        return scan.nextInt();
    }

    public static int inputTryNumber(){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scan.nextInt();
    }

    public static void scanClose(){
        scan.close();
    }
}

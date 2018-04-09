package racing;

import java.util.Scanner;

public class RacingInput {
    private final static Scanner scanner = new Scanner(System.in);

    public static String inputCars(){
        System.out.println("경주자는 누구인가요(이름을 입력해주세요)?");
        return scanner.nextLine();
    }

    public static int inputTrials(){
        System.out.println("시도할 회수는 몇 회인가요?");
        return scanner.nextInt();
    }
}

package racing;

import java.util.Scanner;

public class RacingInput {
    private final static Scanner scanner = new Scanner(System.in);

    public static int inputCars(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public static int inputTrials(){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}

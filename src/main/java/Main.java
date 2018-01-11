import game.RacingGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carsName = sc.next();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = sc.nextInt();

        RacingGame game = new RacingGame(carsName, tryCount);
        game.moveTry();
        game.resultPrint();
    }
}

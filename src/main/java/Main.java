import game.RacingGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int carsCount = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = sc.nextInt();

        RacingGame game = new RacingGame(carsCount, tryCount);
        game.resultPrint();
    }
}

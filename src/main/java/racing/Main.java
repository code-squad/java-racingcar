package racing;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        RacingGame game = null;

        System.out.println("자동차 대수는 몇 대 인가요?");
        int number = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int trials = scanner.nextInt();

        game = new RacingGame(number, trials);

        game.startRacing();

    }
}

package car;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        RacingGame game = new RacingGame();

        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCars = scan.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int time = scan.nextInt();

        System.out.println("실행 결과");
        game.move(time, numberOfCars);
    }

}

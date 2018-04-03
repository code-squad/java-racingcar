package racingGame;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 대수는 몇 대 인가요?: ");
        int numberOfCars = scan.nextInt();
        System.out.print("시도할 회수는 몇 회 인가요?: ");
        int time = scan.nextInt();

        System.out.println("실행 결과");
        Game game = new Game();
        game.start(time, numberOfCars);
    }

}

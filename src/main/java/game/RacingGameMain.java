package game;

import java.util.Scanner;

public class RacingGameMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("자동차 대수는 몇대 인가요? ");
    int cars = scanner.nextInt();
    System.out.print("시도할 회수는 몇 회 인가요? ");
    int times = scanner.nextInt();

    RacingGame racingGame = new RacingGame(cars, times);
    racingGame.move();
    racingGame.print();
  }
}

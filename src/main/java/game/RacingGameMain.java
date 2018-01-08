package game;

import car.Car;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingGameMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분) ");
    String carNames = scanner.next();
    System.out.print("시도할 회수는 몇 회 인가요? ");
    int times = scanner.nextInt();

    List<Car> cars = RacingGameCarFactory.createCars(carNames);
    RacingGame racingGame = new RacingGame(cars, times);
    ResultView resultView = new ResultView(carNames);

    RacingGameRuleGenerator gameRuleGenerator = () -> new Random().nextInt(10);
    List<Result> results = racingGame.racing(gameRuleGenerator);

    resultView.setResults(results);
    resultView.printResult();
  }
}
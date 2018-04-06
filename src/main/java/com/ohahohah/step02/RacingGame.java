package com.ohahohah.step02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 초간단 자동차 경주게임
 */
public class RacingGame {

  public static void main(String[] args) {

    List<String> carNames = InputView.getCarsName();
    int tryNum = InputView.getTryNum();

    GameResult gameResult = null;
    List<Car> players = createCars(carNames);

    for (int i = 0; i < tryNum; i++) {
      gameResult = raceSinglePeriod(players);
      ResultView.printStatus(gameResult.getPlayers());
    }
    ResultView.printResult(gameResult.getWinnerNames());
  }

  public static List<Car> createCars(List<String> carNames) {
    List<Car> players = new ArrayList<>();
    for (int i = 0; i < carNames.size(); i++) {
      players.add(new Car(carNames.get(i), 0));
    }
    return players;
  }

  private static GameResult raceSinglePeriod(List<Car> players) {
    for (Car player : players) {
      int randomVal = ThreadLocalRandom.current().nextInt(0, 9 + 1);
      player.move(player.stopOrGo(randomVal));
    }
    return new GameResult(players);
  }
}
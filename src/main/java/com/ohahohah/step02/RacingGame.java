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
    int raceNum = InputView.getRaceNum();

    List<Car> players = createCars(carNames);

    for (int i = 0; i < raceNum; i++) {
      raceSinglePeriod(players);
      ResultView.printStatus(players);
    }
    ResultView.printResult(pickWinner(players));
  }

  public static List<Car> createCars(List<String> carNames) {
    List<Car> players = new ArrayList<>();
    for (int i = 0; i < carNames.size(); i++) {
      players.add(new Car(carNames.get(i), 0));
    }
    return players;
  }

  private static void raceSinglePeriod(List<Car> players) {
    for (Car player : players) {
      int randomVal = ThreadLocalRandom.current().nextInt(0, 9 + 1);
      player.move(player.stopOrGo(randomVal));
    }
  }

  public static List<String> pickWinner(List<Car> players) {
    Collections.sort(players, Car.carCoordsComparator);

    int maxCoords = players.get(0).getCoords();
    List<String> winnerNames = new ArrayList<>();

    for (Car player : players) {
      if (player.getCoords() < maxCoords) {
        break;
      }
      winnerNames.add(player.getPlayerName());
    }
    return winnerNames;
  }
}

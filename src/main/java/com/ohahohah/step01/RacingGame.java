package com.ohahohah.step01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *  초간단 자동차 경주게임
 */
public class RacingGame {

  public static void main(String[] args) {

    int carNum = InputView.getCarNum();
    int raceNum = InputView.getRaceNum();

    List<Car> players = createCars(carNum);

    for (int i = 0; i < raceNum; i++) {
      raceSinglePeriod(players);
      ResultView.printStatus(players);
    }
  }

  public static List<Car> createCars(int carNum) {
    List<Car> players = new ArrayList<>();
    for (int i = 0; i < carNum; i++) {
      players.add(new Car(i, 0));
    }
    return players;
  }

  private static void raceSinglePeriod(List<Car> players) {
    for (Car player : players) {
      int randomVal = ThreadLocalRandom.current().nextInt(0, 9 + 1);
      player.move(player.stopOrGo(randomVal));
    }
  }
}

package com.ohahohah.step02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 자동차 경주게임 결과 class
 */
public class GameResult {

  private List<Car> players;

  public List<Car> getPlayers() {
    return players;
  }

  public GameResult(List<Car> players) {
    this.players = new ArrayList<>(players);
  }

  public List<String> getWinnerNames() {
    Collections.sort(players, Car.carCoordsComparator);
    int maxCoords = players.get(0).getCoords();

    return getNames(players, getSameCoords(maxCoords));
  }

  List<Integer> getSameCoords(int coords) {
    List<Integer> sameCoordsIdx = new ArrayList<>();
    for (int i = 0; i < players.size(); i++) {
      Car player = players.get(i);
      if (player.getCoords() == coords) {
        sameCoordsIdx.add(i);
      }
    }
    return sameCoordsIdx;
  }

  private static List<String> getNames(List<Car> cars, List<Integer> idxes) {
    List<String> addNames = new ArrayList<>();
    for (int i : idxes) {
      addNames.add(cars.get(i).getPlayerName());
    }
    return addNames;
  }
}
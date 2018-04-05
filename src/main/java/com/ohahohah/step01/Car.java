package com.ohahohah.step01;

import java.util.ArrayList;
import java.util.List;

/**
 * 자동차 경주게임을 위한 자동차 class
 */
public class Car {

  private int playerNum;
  private int coords;
  private List<Integer> coordsLog;

  public Car() {
  }

  public Car(int coords) {
    this.coords = coords;
  }

  public Car(int playerNum, int coords) {
    this.playerNum = playerNum;
    this.coords = coords;
    this.coordsLog = new ArrayList<>();
  }

  public int getPlayerNum() {
    return playerNum;
  }

  public int getCoords() {
    return coords;
  }

  public int stopOrGo(int randomValue) {
    if (randomValue >= 4) {
      return 1;
    }
    return 0;
  }

  public void move(int i) {
    coords += i;
  }

  public void saveCoordiate(int coordinate) {
    coordsLog.add(coords + coordinate);
  }

}

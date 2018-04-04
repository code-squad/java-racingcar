package com.ohahohah.step01;

import java.util.stream.Stream;

public class Car {

  private int playerNum;
  private int coordinate;

  public Car(int playerNum, int coordinate) {
    this.playerNum = playerNum;
    this.coordinate = coordinate;
  }

  public int getCoordinate() {
    return coordinate;
  }

  public int stopOrGo(int randomValue) {
    if(randomValue >= 4){
      return 1;
    }
    return 0;
  }

  public void moveForward(int i) {
    coordinate +=i;
  }

  //TODO go to view
  public String coordinateToStr() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < coordinate; i++) {
      sb.append("-");
    }
    return sb.toString();
  }
}

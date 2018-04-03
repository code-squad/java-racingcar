package com.ohahohah.step01;

import java.util.concurrent.ThreadLocalRandom;

public class Car {

  private int playerNum;
  private int progress;

  public Car(int playerNum, int progress) {
    this.playerNum = playerNum;
    this.progress = progress;
  }

  public void stopOrGo() {
    if (isForwarding()) {
      moveForward();
    }
  }

  public void moveForward() {
    progress += 1;
  }

  public boolean isForwarding() {
    if (ThreadLocalRandom.current().nextInt(0, 9 + 1) >= 4) {
      return true;
    }
    return false;
  }

  public void printRaceStatus() {
    for (int i = 0; i < progress; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}

package com.ohahohah.step01;

import static com.ohahohah.step01.Parser.changeInt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCar {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("자동차 대수는 몇 대 인가요?");

    List<Car> players = createCars(changeInt(scanner.nextLine()));
    System.out.println("시도할 회수는 몇 회 인가요?");

    doRace(changeInt(scanner.nextLine()), players);

  }

  public static void doRace(int raceNum, List<Car> players) throws IllegalArgumentException {
    for (int i = 1; i <= raceNum; i++) {
      System.out.println(i + " 회차");
      for (Car player : players) {
        doSmallRace(player);
      }
    }
  }

  public static List<Car> createCars(int carNum) {
    List<Car> players = new ArrayList<>();
    for (int i = 0; i < carNum; i++) {
      players.add(new Car(i, 0));
    }
    return players;
  }

  private static void doSmallRace(Car player) {
    player.stopOrGo();
    player.printRaceStatus();
  }

}

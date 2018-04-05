package com.ohahohah.step01;

import java.util.List;

/**
 * 초간단 자동차 경주게임 결과 출력을 위한 class
 */
public class ResultView {

  public static void printStatus(List<Car> cars) {
    for (Car car : cars) {
      System.out.println(coordsToStr(car.getCoords()));
    }
    System.out.println();
  }

  public static String coordsToStr(int coord) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < coord; i++) {
      sb.append("-");
    }
    return sb.toString();
  }

}

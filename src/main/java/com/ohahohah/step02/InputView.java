package com.ohahohah.step02;

import java.util.List;
import java.util.Scanner;

/**
 * 파라미터 입력을 위한 화면출력 class
 */
public class InputView {

  public static int getCarNum() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("자동차 대수는 몇 대 인가요?");
    return Parser.changeInt(scanner.nextLine());
  }

  public static int getTryNum() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("시도할 회수는 몇 회 인가요?");
    return Parser.changeInt(scanner.nextLine());
  }

  public static List<String> getCarsName() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    return Parser.changeStrList(scanner.nextLine());
  }
}

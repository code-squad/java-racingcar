package com.ohahohah.step01;

import static com.ohahohah.step01.Parser.changeInt;

import java.util.Scanner;

/**
 * 파라미터 입력을 위한 화면출력 class
 */
public class InputView {

  public static int getCarNum() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("자동차 대수는 몇 대 인가요?");
    return changeInt(scanner.nextLine());
  }

  public static int getRaceNum() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("시도할 회수는 몇 회 인가요?");
    return changeInt(scanner.nextLine());
  }
}

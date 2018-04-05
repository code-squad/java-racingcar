package com.ohahohah.step01;

/**
 * String 입력을 parsing하는 class
 */
public class Parser {

  public static int changeInt(String s) {
    checkDigit(s);
    return Integer.parseInt(s);
  }

  public static void checkDigit(String s) {
    if (!s.matches("(\\d)+")) {
      throw new IllegalArgumentException("숫자가 아닙니다.");
    }
  }

}

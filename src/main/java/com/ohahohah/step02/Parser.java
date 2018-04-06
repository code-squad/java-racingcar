package com.ohahohah.step02;

import static com.google.common.base.Strings.isNullOrEmpty;
import com.google.common.base.CharMatcher;
import java.util.Arrays;
import java.util.List;

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

  public static void checkBlank(String s) {
    if (isNullOrEmpty(CharMatcher.WHITESPACE.removeFrom(s))) {
      throw new IllegalArgumentException("빈 문자열입니다.");
    }
  }

  public static List<String> changeStrList(String s) {
    checkBlank(s);
    return Arrays.asList(s.split(","));
  }
}

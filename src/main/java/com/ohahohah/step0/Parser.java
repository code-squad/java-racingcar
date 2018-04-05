package com.ohahohah.step0;

import java.util.ArrayList;
import java.util.List;


/**
 * 문자열 확인
 */
public class Parser {

  /**
   * 문자열 형식 유효성 확인하고, 띄어쓰기(" ")기준으로 나눔
   * @param input
   * @return 문자
   * @throws IllegalArgumentException
   */
  public List<String> parseStr(String input) throws IllegalArgumentException {
    checkBlankStr(input);

    List<String> inputs = new ArrayList<>();
    for (String s : input.split(" ")) {
      checkParamValidation(s);
      inputs.add(s);
    }

    return inputs;

  }

  /**
   * 빈 문자열인지 확인
   * @param s
   * @throws IllegalArgumentException
   */
  public void checkBlankStr(String s) throws IllegalArgumentException {
    if (s == null || s.isEmpty()) {
      throw new IllegalArgumentException();
    }
  }

  /**
   * 숫자 또는 사칙연산기호(+,-,*,/)인지 확인
   * @param s
   * @throws IllegalArgumentException
   */
  public void checkParamValidation(String s) throws IllegalArgumentException {
    if (!s.matches("(\\d)+|\\+|\\-|\\*|\\/")) {
      throw new IllegalArgumentException();
    }
  }

  /**
   * 정해진 형식(문자열의 처음과 끝은 숫자여야함. e.g.  3 * 3 / 2 - 5)대로 입력되었는지 확인
   * @param s
   */
  public void checkParamsOrder(String s) {
    if (!s.matches("(\\d)+ (\\+|\\-|\\*|\\/) (\\d)+")) {
      throw new IllegalArgumentException();
    }

  }
}

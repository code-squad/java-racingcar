package com.ohahohah.step0;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 문자열 사칙연산 계산기 (입력순서에 따라 연산함)
 */
public class StringCalculator {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();

    System.out.println(doCals(value));

  }

  public static double doCals(String input) {

    Map<String, Calculator> operand = new HashMap<String, Calculator>() {{
      put("+", new CalculatorSum());
      put("-", new CalculatorMinus());
      put("*", new CalculatorMultiple());
      put("/", new CalculatorDivide());
    }};

    Parser parser = new Parser();

    List<String> inputs = parser.parseStr(input);
    double result = Double.parseDouble(inputs.get(0));

    for (int i = 1; i < inputs.size(); i += 2) {
      result = cal(operand.get(inputs.get(i)), result, Double.parseDouble(inputs.get(i + 1)));
    }

    return result;
  }

  public static double cal(Calculator cal, double num01, double num02) {

    return cal.cal(num01, num02);
  }

}

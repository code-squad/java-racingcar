package com.ohahohah.step0;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class StringCalculator {

  //TODO 주석
  public static void main(String args[]) {


    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();

    System.out.println(doCals(value));


  }

  public static double doCals(String input) {

    Parser parser = new Parser();
    Caculator cal = new Caculator();

    List<String> inputs = parser.parseStr(input);
    double result = Double.parseDouble(inputs.get(0));

    for (int i = 1; i < inputs.size(); i += 2) {
      result = cal.doCal(inputs.get(i), result, Double.parseDouble(inputs.get(i + 1)));
    }

    return result;
  }
}

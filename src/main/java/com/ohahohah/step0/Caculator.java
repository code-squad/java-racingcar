package com.ohahohah.step0;

public class Caculator {

  public double sum(double num01, double num02) { return num01 + num02; }

  public double subtract(double num01, double num02) {
    return num01 - num02;
  }

  public double multiple(double num01, double num02) {
    return num01 * num02;
  }

  public Double divide(double num01, double num02) { return num01 / num02; }

  public Double doCal(String operator, double previousNum, double nextNum) {
    switch (operator) {
      case "+":
        return sum(previousNum, nextNum);
      case "-":
        return subtract(previousNum, nextNum);

      case "*":
        return multiple(previousNum, nextNum);

      case "/":
        return divide(previousNum, nextNum);
    }
    return null;
  }



}

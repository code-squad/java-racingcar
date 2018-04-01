package com.codesquad.calculatorapp;

import com.codesquad.calculator.StringCalculator;

import java.util.Scanner;

public class ConsoleStringCalculatorApp {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String inputExpression = scanner.nextLine();
        final StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.calculate(inputExpression));
    }
}

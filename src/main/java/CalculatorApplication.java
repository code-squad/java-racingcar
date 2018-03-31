import calculator.StringExpressionCalculator;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        StringExpressionCalculator stringExpressionCalculator = new StringExpressionCalculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("calculate result : " + stringExpressionCalculator.calculate(scanner.nextLine()));
    }
}

package calculator;

import java.util.Scanner;

public class Calculator {
    private static final String SPLIT_STANDARD = " ";
    private String input;

    public void getInput() {
        input = new Scanner(System.in).nextLine();
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getCalculate() {
        String[] inputArr = splitInput();
        int result = Integer.parseInt(inputArr[0]);
        for(int i = 1; i < inputArr.length; i+=2) {
            int num = Integer.parseInt(inputArr[i + 1]);
            result = calculate(result, num, inputArr[i]);
        }
        return result;
    }

    private int calculate(int result, int num, String op) {
        switch (op) {
            case "+" :
                return add(result, num);
            case "-" :
                return sub(result, num);
            case "*" :
                return multiply(result, num);
            case "/" :
                return divide(result, num);
        }
        return 0;
    }

    private String[] splitInput() {
        return input.split(SPLIT_STANDARD);
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a  * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }
}

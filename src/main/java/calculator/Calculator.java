package calculator;

import calculator.operator.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    public int calc(String value) {
        int result = 0;
        String operator = null;

        for (String param : parse(value)) {

            if(isBlank(param)) {
                throw new IllegalArgumentException();
            }

            if (isOperator(param)) {
                operator = param;
                continue;
            }

            if (operator == null) {
                result = Integer.parseInt(param);
                continue;
            }

            result = operate(operator, result, Integer.parseInt(param));
            operator = null;
        }

        return result;
    }

    public String[] parse(String value) {
        return value.split(" ");
    }

    public int operate(String operator, int a, int b) {
        Map<String, Operator> map = new HashMap();
        map.put("+", new Add());
        map.put("-", new Minus());
        map.put("*", new Multiplication());
        map.put("/", new Division());

        return map.get(operator).operate(a, b);
    }

    public boolean isOperator(String value) {
        String[] operators = {"+", "-", "*", "/"};
        return Arrays.asList(operators).contains(value);
    }

    private static boolean isBlank(String value) {
        return value == null || value.equals("");
    }


    public static void main(String[] args) {
        System.out.println("= 를 입력하시면 계산됩니다.");

        String inputValue = "";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();

            if(isBlank(value)) {
                scanner.close();
                throw new IllegalArgumentException();
            }

            if(value.equals("=")) {
                Calculator calculator = new Calculator();
                int result = calculator.calc(inputValue);
                System.out.println(inputValue + " = " + result);
                break;
            }

            inputValue = inputValue.concat(" ").concat(value);
            System.out.println(inputValue);
        }
    }
}

package calculator;

import java.util.Arrays;

public class Calculator {

    public String[] parse(String value) {
        return value.split(" ");
    }

    public int calc(String value) {
        int result = 0;
        String operator = null;

        String[] params = parse(value);

        for (String param : params) {
            if (isOperator(param)) {
                operator = param;
                continue;
            }

            if(operator == null) {
                result = Integer.parseInt(param);
                continue;
            }

            if(operator.equals("+")) {
                result = add(result, Integer.parseInt(param));
                operator = null;
                continue;
            }

            if(operator.equals("-")) {
                result = minus(result, Integer.parseInt(param));
                operator = null;
                continue;
            }

            if(operator.equals("*")) {
                result =  multiplication(result, Integer.parseInt(param));
                operator = null;
                continue;
            }

            if(operator.equals("/")) {
                result = division(result, Integer.parseInt(param));
                operator = null;
                continue;
            }
        }

        return result;
    }

    public boolean isOperator(String value) {
        String[] operators = {"+", "-", "*", "/"};
        return Arrays.asList(operators).contains(value);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }
}

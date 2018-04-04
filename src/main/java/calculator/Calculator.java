package calculator;

public class Calculator {

    public static int calculate(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException();
        }

        String[] expressionValue = splitExpressionValue(value);

        return calculateExpression(expressionValue);
    }

    private static String[] splitExpressionValue(String value) {
        return value.split(" ");
    }

    private static int calculateExpression(String[] expressionValue) {
        int result = Integer.valueOf(expressionValue[0]);
        for (int i = 1; i < expressionValue.length; i += 2) {
            result = selectOperation(expressionValue[i], result, Integer.valueOf(expressionValue[i + 1]));
        }
        return result;
    }

    private static int selectOperation(String operator, int a, int b) {
        return operator.equals("+") ? add(a, b) : operator.equals("-")
                ? sub(a, b) : operator.equals("*")
                ? multiply(a, b) : divide(a, b);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}

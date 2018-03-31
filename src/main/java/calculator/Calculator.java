package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String, Operator> operator;

    public Calculator() {
        operator = new HashMap<>();
        operator.put("+", new AddOperator());
        operator.put("-", new SubtractOperator());
        operator.put("*", new MultiplyOperator());
        operator.put("/", new DivideOperator());
    }

    public int calculate(String expression) {
        String[] split = expression.split(" ");
        return calculate(split);
    }

    private int calculate(String[] array) {
        int total = toInt(array[0]);
        
        for (int i = 1; i < array.length; i++) {
            Operator op = operator.get(array[i]);
            if (op != null) {
                total = op.operate(total, toInt(array[i + 1]));
            }
        }

        return total;
    }

    @Deprecated
    public int add(int i, int j) {
        return i + j;
    }

    @Deprecated
    public int subtract(int i, int j) {
        return i - j;
    }

    @Deprecated
    public int multiply(int i, int j) {
        return i * j;
    }

    @Deprecated
    public int divide(int i, int j) {
        return i / j;
    }

    public int toInt(String string) {
        int value = 0;

        try {
            value = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            // TODO 예외처리
            throw new NumberFormatException();
        }

        return value;
    }
}

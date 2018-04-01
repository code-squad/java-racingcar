package calculator;

import java.util.HashSet;
import java.util.Stack;

public class Calculator {

    static HashSet<String> operatorSet = new HashSet<>();
    static {
        operatorSet.add("+");
        operatorSet.add("-");
        operatorSet.add("*");
        operatorSet.add("/");
    }

    public static int calculate(String expression) {
        String[] splitExpression = expression.split(" ");
        int length = splitExpression.length;
        int prevValue = Integer.parseInt(splitExpression[0]);
        int result = 0;
        Stack<String> operator = new Stack<>();

        for (int index = 1; index < length; index++) {
            if (hasOperator(splitExpression[index])) {
                operator.push(splitExpression[index]);
                continue;
            }

            int nextValue = Integer.parseInt(splitExpression[index]);
            String currentOperator = operator.pop();

            result = getResult(prevValue, nextValue, currentOperator);
            prevValue = result;
        }

        return result;
    }

    private static int getResult(int prevValue, int nextValue, String currentOperator) {
        switch (currentOperator) {
            case "+" :
                return prevValue + nextValue;
            case "-" :
                return prevValue - nextValue;
            case "*" :
                return prevValue * nextValue;
            case "/" :
                return prevValue / nextValue;
        }
        return -1;
    }

    private static boolean hasOperator(String o) {
        return operatorSet.contains(o);
    }
}

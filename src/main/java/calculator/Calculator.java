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
        int length = expression.length();
        int prevValue = Integer.parseInt(splitExpression[0]);
        int result = 0;
        Stack<String> operator = new Stack<>();

        for (int index = 1; index < length; index++) {
            if (operatorSet.contains(splitExpression[index])) {
                operator.push(splitExpression[index]);
                continue;
            }

            int nextValue = Integer.parseInt(splitExpression[index]);
            String currentOperator = operator.pop();

            switch (currentOperator) {
                case "+" :
                    result = prevValue + nextValue;
                    break;
                case "-" :
                    result = prevValue - nextValue;
                    break;
                case "*" :
                    result = prevValue * nextValue;
                    break;
                case "/" :
                    result = prevValue / nextValue;
                    break;
            }
            prevValue = result;
        }

        return result;
    }

    private boolean validateNumber(char currentCharacter) {
        return currentCharacter >= '0' && currentCharacter <= '9';
    }

    private boolean validateOperator(char currentCharacter) {
        return currentCharacter == '+' || currentCharacter == '-' || currentCharacter == '*' || currentCharacter == '/';
    }

    private int toInt(char charValue) {
        return charValue - '0';
    }
}

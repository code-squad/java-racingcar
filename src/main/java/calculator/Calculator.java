package calculator;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class Calculator {

    private String input;
    private Queue<Integer> operands;
    private Queue<String> operators;
    private Map<String, Operator> operatorMap;
    private final static String SPLIT_REGEX = " ";
    private final static String ADD = "+";
    private final static String SUB = "-";
    private final static String MUL = "*";
    private final static String DIV = "/";

    Calculator(String input) {
        checkArgumentException(input);

        this.input = input;
        this.operands = parseOperand();
        this.operators = parseOperator();
        this.operatorMap = new HashMap<>();
        this.operatorMap.put(ADD, new Operator.Add());
        this.operatorMap.put(SUB, new Operator.Sub());
        this.operatorMap.put(MUL, new Operator.Mul());
        this.operatorMap.put(DIV, new Operator.Div());
    }

    public int calculate() {
        int calculateResult = 0;
        int operand_x = operands.poll();

        while (!operators.isEmpty() && !operands.isEmpty()) {
            int operand_y = operands.poll();
            String operator = operators.poll();

            calculateResult += getOperator(operator).execute(operand_x, operand_y);
            operand_x = calculateResult;
        }

        return calculateResult;
    }

    private Operator getOperator(String operator) {
        if (operatorMap.containsKey(operator))
            return operatorMap.get(operator);

        throw new IllegalArgumentException();
    }

    private Queue<Integer> parseOperand() {
        return Arrays.stream(input.split(SPLIT_REGEX))
                .filter(getParseOperandPredicate(ADD)
                        .and(getParseOperandPredicate(SUB))
                        .and(getParseOperandPredicate(MUL))
                        .and(getParseOperandPredicate(DIV)))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private Queue<String> parseOperator() {
        return Arrays.stream(input.split(SPLIT_REGEX))
                .filter(getParseOperatorPredicate(ADD)
                        .or(getParseOperatorPredicate(SUB))
                        .or(getParseOperatorPredicate(MUL))
                        .or(getParseOperatorPredicate(DIV)))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private Predicate<String> getParseOperandPredicate(String operator) {
        return o -> !o.equals(operator);
    }

    private Predicate<String> getParseOperatorPredicate(String operator) {
        return o -> o.equals(operator);
    }

    private void checkArgumentException(String input) {
        if (isNull(input) || input.equals(""))
            throw new IllegalArgumentException();
    }
}

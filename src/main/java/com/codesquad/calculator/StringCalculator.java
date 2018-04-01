package com.codesquad.calculator;

import com.codesquad.calculation.*;
import spark.utils.StringUtils;

public class StringCalculator {
    public StringCalculator() {

    }

    public int calculate(final String inputExpression) {
        if (StringUtils.isBlank(inputExpression)) {
            throw new IllegalArgumentException("입력값이 null 또는 공백 문자열입니다.");
        }

        final String[] expressions = splitInputExpr(inputExpression);

        int leftOperand = parseOperand(expressions[0]);

        for (int i = 1; i < expressions.length; i += 2) {
            final String operator = expressions[i];
            final int rightOperand = parseOperand(expressions[i + 1]);
            leftOperand = calculate(operator, leftOperand, rightOperand);
        }

        return leftOperand;
    }

    private int calculate(final String operator, final int leftOperand, final int rightOperand) {
        final Calculable calculable = getCalculation(operator);
        return calculable.calculate(leftOperand, rightOperand);
    }

    private String[] splitInputExpr(final String inputExpr) {
        final String[] expressions = inputExpr.split(" ");
        if (isExpressionsEven(expressions)) {
            throw new IllegalArgumentException("유효하지 않은 식입니다.");
        }

        if (isExpressionsLessThanThree(expressions)) {
            throw new IllegalArgumentException("최소 3개의 식이 필요합니다.");
        }

        return expressions;
    }

    private boolean isExpressionsEven(final String[] expressions) {
        return expressions.length % 2 == 0;
    }

    private boolean isExpressionsLessThanThree(final String[] expressions) {
        return expressions.length < 3;
    }

    private int parseOperand(final String operand) {
        try {
            return Integer.parseInt(operand);
        } catch (final NumberFormatException e) {
            throw new IllegalArgumentException(
                    "피연산자 \"" + operand + "\"" + "는 숫자로 변환될 수 없습니다.", e);
        }
    }

    private Calculable getCalculation(final String operator) {
        if ("+".equals(operator)) {
            return new Addition();
        }

        if ("-".equals(operator)) {
            return new Subtraction();
        }

        if ("*".equals(operator)) {
            return new Multiplication();
        }

        if ("/".equals(operator)) {
            return new Division();
        }

        throw new IllegalArgumentException("잘못된 연산자입니다.");
    }
}

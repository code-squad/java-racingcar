package com.codesquad.sequentialcalculator.calculation;

public class Division implements Calculable {
    @Override
    public int calculate(final int leftOperand, final int rightOperand) {
        if (rightOperand == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }

        return leftOperand / rightOperand;
    }
}

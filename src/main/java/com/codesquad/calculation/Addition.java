package com.codesquad.calculation;

public class Addition implements Calculable {
    @Override
    public int calculate(final int leftOperand, final int rightOperand) {
        return leftOperand + rightOperand;
    }
}

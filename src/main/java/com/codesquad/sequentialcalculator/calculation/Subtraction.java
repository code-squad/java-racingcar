package com.codesquad.sequentialcalculator.calculation;

public class Subtraction implements Calculable {
    @Override
    public int calculate(final int leftOperand, final int rightOperand) {
        return leftOperand - rightOperand;
    }
}

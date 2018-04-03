package com.codesquad.sequentialcalculator.calculation;

public class Multiplication implements Calculable {
    @Override
    public int calculate(final int leftOperand, final int rightOperand) {
        return leftOperand * rightOperand;
    }
}

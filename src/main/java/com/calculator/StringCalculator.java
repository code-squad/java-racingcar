package com.calculator;

import spark.utils.StringUtils;

public class StringCalculator {
    public StringCalculator() {

    }

    public int calculate(String inputExpr) {
        if(StringUtils.isBlank(inputExpr)) {
            throw new IllegalArgumentException("입력값이 null 또는 공백 문자열입니다.");
        }

        String[] expressions = inputExpr.split(" ");
        if(expressions.length < 3) {
            throw new IllegalArgumentException("2개 이상의 피연산자가 필요합니다.");
        }
        return 0;
    }

}
package calculator;

import java.util.List;

public class Calculator {

    public int calculate(String value) {
        String[] sepArr = null;
        try {
            sepArr = splitValue(checkIllegalValue(value));

        } catch(IllegalArgumentException ie) {
            ie.printStackTrace();
            return 0;
        }

        return cal2(sepArr);
    }

    private String[] splitValue(String value) {
        return value.split(" ");
    }

    private int cal2(String[] arr) {

        int num = Integer.valueOf(arr[0]);

        for(int i = 2; i<arr.length+1; i++) {
            if(i % 2 == 0) {
                num = cal(arr[i-2], num, Integer.valueOf(arr[i]));
            }
        }

        return num;
    }

    private int cal(String op, int a, int b) {
        if(op == "+") {
            return add(a,b);
        }
        if(op == "-") {
            return sub(a,b);
        }
        if(op == "*") {
            return multiply(a,b);
        }
        if(op == "/") {
            return divide(a,b);
        }

        return 0;
    }

    private String checkIllegalValue(String value) throws IllegalArgumentException{
        checkIsNull(value);
        checkIsEmptyString(value);
        return value;
    }

    private void checkIsNull(String value) throws IllegalArgumentException {
        if (value == null) {
            new IllegalArgumentException();
        }
    }

    private void checkIsEmptyString(String value) throws IllegalArgumentException {
        if(value.trim() == "") {
            new IllegalArgumentException();
        }
    }

    private int add(int a, int b) {
        return a+b;
    }

    private int sub(int a, int b) {
        return a+b;
    }

    private int multiply(int a, int b) {
        return a+b;
    }

    private int divide(int a, int b) {
        return a+b;
    }
}

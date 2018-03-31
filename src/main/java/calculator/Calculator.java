package calculator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Calculator {

    static HashSet<String> calSet = new HashSet<>();
    static Stack<String> stack = new Stack();

    static {
        calSet.add("+");
        calSet.add("-");
        calSet.add("*");
        calSet.add("/");
    }

    public static int calculate(String inputData) {

        int preNum = 0;
        boolean isFirst = true;

        isRightValidation(inputData);

        for(String data:inputData.split(" ")) {

            if(isFirst) {
                isFirst = false;
                preNum = Integer.valueOf(data);
                continue;
            }

            if(calSet.contains(data)) {
               stack.push(data);
           } else {
               String preCal = stack.pop();
               int thisNum = Integer.valueOf(data);

               switch (preCal) {
                   case "+" :
                       preNum = plus(preNum,thisNum);
                       break;

                   case "-" :
                       preNum = minus(preNum,thisNum);
                       break;

                   case "/" :
                       preNum = divide(preNum,thisNum);
                       break;

                   case "*":
                       preNum = multiple(preNum,thisNum);
                       break;
               }
           }
        }

        return preNum;
    }

    private static void isRightValidation(String inputData) {
        if(inputData == null || "".equals(inputData)) {
            throw new IllegalArgumentException();
        }
    }

    private static int plus(int x, int y) {
        return x + y;
    }

    private static int minus(int x, int y) {
        return x - y;
    }

    private static int divide(int x, int y) {
        return x / y;
    }

    private static int multiple(int x, int y) {
        return x * y;
    }
}

interface CalculatorInterface {

    public int calculate(int x,int y);
}

class PlusCalculator implements CalculatorInterface {

    @Override
    public int calculate(int x,int y) {
        return x + y;
    }
}

class MinusCalculator implements CalculatorInterface {

    @Override
    public int calculate(int x, int y) {
        return x - y;
    }
}

class DevideCalculator implements CalculatorInterface {

    @Override
    public int calculate(int x, int y) {
        return x / y;
    }
}

class MultipleCalculator implements CalculatorInterface {

    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}


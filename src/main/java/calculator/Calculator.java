package calculator;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Scanner;

class Calculator{
    public double calculate(String inputStr) {
         //일단 스페이스바로 나눠져있다고 보자.

        checkInputStr(inputStr);

        String arrInputStr [] = inputStr.split(" " );

        double resultNumber = Double.parseDouble(arrInputStr[0]);

        for(int i=1; i<arrInputStr.length; i += 2 ) {
            double inputNumber1 = resultNumber;
            double inputNumber2 = Double.parseDouble(arrInputStr[i+1]);
            resultNumber = doArithmetic(arrInputStr[i], resultNumber, inputNumber1, inputNumber2);
        }

        return resultNumber;
   }

    private void checkInputStr(String inputStr) {
        checkNull(inputStr);
        String arrInputStr [] = inputStr.split(" " );
        for(int i=0; i<arrInputStr.length; i++){
            checkNull(arrInputStr[i]);
        }
    }

    private void checkNull(String s) {
        if(s == null || "".equals(s)){
            throw new IllegalArgumentException();
        }
    }


    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       while(true) {
           String value = scanner.nextLine();
           Calculator calculator = new Calculator();
           System.out.println( "result : " + calculator.calculate(value) );
       }
   }

    private double doArithmetic(String s, double resultNumber, double inputNumber1, double inputNumber2) {
        HashMap<String, ArithemeticInterface> calculatorMap = new HashMap<String, ArithemeticInterface>();
        ArithemeticInterface arithmeticInterface;

        calculatorMap.put("+", new ArithmeticAdd());
        calculatorMap.put("-", new ArithmeticMinus());
        calculatorMap.put("*", new ArithmeticMultiple());
        calculatorMap.put("/", new ArithmeticDivide());

        arithmeticInterface = calculatorMap.get(s);

        return arithmeticInterface.calculate(inputNumber1, inputNumber2);

    }
}
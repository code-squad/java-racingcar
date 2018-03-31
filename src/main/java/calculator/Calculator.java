package calculator;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class Calculator{
    public double calculate(String inputStr) {
         //일단 스페이스바로 나눠져있다고 보자.
        String arrInputStr [] = inputStr.split(" " );

        CheckNull(arrInputStr[0]);

        double resultNumber = Double.parseDouble(arrInputStr[0]);

        for(int i=1; i<arrInputStr.length; i += 2 ) {
            double inputNumber1 = resultNumber;
            CheckNull(arrInputStr[i]);
            CheckNull(arrInputStr[i+1]);
            double inputNumber2 = Double.parseDouble(arrInputStr[i+1]);
            resultNumber = doArithmetic(arrInputStr[i], resultNumber, inputNumber1, inputNumber2);
        }

        return resultNumber;
   }

    private void CheckNull(String s) {
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
        switch (s) {
            case "+":
                return inputNumber1 + inputNumber2;
            case "-":
                return inputNumber1 - inputNumber2;
            case "*":
                return inputNumber1 * inputNumber2;
            case "/":
                return inputNumber1 / inputNumber2;
        }
        return resultNumber;
    }
}
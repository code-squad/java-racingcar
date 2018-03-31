package calculator;

import org.junit.jupiter.api.Test;

class Calculator{
    public double calculate(String inputStr){
         //일단 스페이스바로 나눠져있다고 보자.
        String arrInputstr [] = inputStr.split(" " );
        double resultNumber = Double.parseDouble(arrInputstr[0]);

        for(int i=1; i<arrInputstr.length; i += 2 ) {

            double inputNumber1 = resultNumber;
            double inputNumber2 = Double.parseDouble(arrInputstr[i+1]);
            switch (arrInputstr[i]) {
                case "+":
                    resultNumber = inputNumber1 + inputNumber2;
                    break;
                case "-":
                    resultNumber = inputNumber1 - inputNumber2;
                    break;
                case "*":
                    resultNumber = inputNumber1 * inputNumber2;
                    break;
                case "/":
                    resultNumber = inputNumber1 / inputNumber2;
                    break;
            }
        }

        return resultNumber;
   }
}
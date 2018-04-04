package calculator;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    /*
    사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
    문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
    예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
    */

public static void main(String[] args) {

    Calculator calculator = new Calculator();
    System.out.println(calculator.input(calculator.setup()));

}

    private String setup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산값을 입력해주세요(ex 5 + 2)");
        return scanner.nextLine();
    }


    public int input(String inputValue) throws IllegalArgumentException {
       if(isBlank(inputValue)){
           throw new IllegalArgumentException();
       }
        String expression ="";
        //System.out.println("결과 :" + returnValue);
        return forCalculator(inputValue.split(" "), expression, setupFirstReturnValue(inputValue.split(" ")[0]));
    }

    private int setupFirstReturnValue(String firstValue) {
        return Integer.parseInt(firstValue);
    }


    private int forCalculator(String[] splitValues, String expression, int returnValue) {
        for (int arrayCounter = 0; arrayCounter < splitValues.length ; arrayCounter++) {

            expression = nextExpression(splitValues, expression, arrayCounter);
            returnValue = checkNumber(splitValues, expression, returnValue, arrayCounter);

        }
        return returnValue;
    }

    private int checkNumber(String[] splitValues, String expression, int returnValue, int arrayCounter) {
        if(isNumber(arrayCounter)){
            //System.out.println("숫자["+arrayCounter+"] :" + splitValues[arrayCounter]);
            returnValue = nextExpression(splitValues, expression, returnValue, arrayCounter);
        }
        return returnValue;
    }

    private String nextExpression(String[] splitValues, String expression, int arrayCounter) {
        if(isExpression(arrayCounter)){
             //System.out.println("연산자" + splitValues[arrayCounter]);
             expression = splitValues[arrayCounter];
        }
        return expression;
    }

    private boolean isNumber(int i) {
        return i % 2 == 0;
    }

    private boolean isExpression(int i) {
        return i % 2 != 0;
    }

    private boolean isBlank(String splitValue) {
        return splitValue == null || splitValue.isEmpty();
    }

    private int nextExpression(String[] splitValues, String expression, int returnValue, int arrayCount) {


       if(expression.equals("+")){
            returnValue += nextNumber(splitValues, arrayCount);
            //System.out.println("returnValue+"+ returnValue);
        }
        if(expression.equals("-")){
            returnValue -= nextNumber(splitValues, arrayCount);
           //System.out.println("returnValue-"+ returnValue);
        }
        if(expression.equals("*")){
            returnValue *= nextNumber(splitValues, arrayCount);
            //System.out.println("returnValue*"+ returnValue);
        }
        if(expression.equals("/")){
            returnValue /= nextNumber(splitValues, arrayCount);
            //System.out.println("returnValue/"+ returnValue);
        }
        return returnValue;
    }

    private int nextNumber(String[] splitValues, int arrayCount) {
        return Integer.parseInt(splitValues[arrayCount]);
    }


}

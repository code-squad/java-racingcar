package calculator;

import java.util.List;
import java.util.Scanner;

public class Main {

    Calculator calculator = new Calculator();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        Parser parser = new Parser();
        Calculator calculator = new Calculator();

        String input = parser.removeSpace(value);

        List<Integer> numbers = parser.extractNumbers(input);
        String operators = parser.extractSpecialChars(input);

    }

    public boolean isValidated(int numsSize, int operatorLength){
        return (numsSize - operatorLength) == 1;
    }

    public void mainStage(List<Integer> numbers, String operators){

        if(!isValidated(numbers.size(),operators.length())){
            throw new IllegalArgumentException();
        }

        int result = numbers.get(0);

        for( int i = 1; i < operators.length(); i++){
            result = operate(result, numbers.get(i), operators.charAt(i-1));
        }

    }

    private int operate(int x, int y, char operator){
        if(operator == '+'){
            return calculator.add(x,y);
        }

        if(operator == '-'){
            return calculator.substract(x,y);
        }

        if(operator == '*'){
            return calculator.muliply(x,y);
        }

        if(operator == '/'){
            return calculator.divide(x,y);
        }
    }

}

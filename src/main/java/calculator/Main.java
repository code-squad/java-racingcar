package calculator;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Calculator calculator;
    private Parser parser;
    private String value;

    public Main(){
        calculator = new Calculator();
        parser = new Parser();
        value = "";
    }

    public Main(String value){
        calculator = new Calculator();
        parser = new Parser();
        this.value = value;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();


        Main main = new Main();

        main.mainStage(value);



    }



    public boolean isValidated(List<Integer> nums, String operators){
        int result = (nums.size() - operators.length());
        return result == 1 || result == 0;
    }


    public void mainStage(){
        String input = parser.removeSpace(value);
        List<Integer> numbers = parser.extractNumbers(input);
        String operators = parser.extractSpecialChars(input);


        if(!isValidated(numbers,operators)){
            throw new IllegalArgumentException();
        }

        int result = numbers.get(0);

        for( int i = 1; i < operators.length() + 1; i++){
            result = operate(result, numbers.get(i), operators.charAt(i-1));
        }

        System.out.println("result : " + result);
    }


    public void mainStage(String value){
        this.value = value;

        mainStage();
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

        throw new InvalidParameterException();
    }

}

package calculator;

import java.util.List;
import java.util.Scanner;

public class Main {

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

    public void operate(List<Integer> numbers, String operators){

        if(!isValidated(numbers.size(),operators.length())){



        }

    }

}

package calculator;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private static String PATTERN = "\\+|-|\\*|\\/";

    public String removeSpace(String input){
        return input.replace(" ","");
    }

    public List<Integer> extractNumbers(String input){
        List<Integer> numbers = new ArrayList<>();

        for(String s : input.split(PATTERN)){
            numbers.add(Integer.parseInt(s));
        }

        return numbers;
    }

    public String extractSpecialChars(String input){

        String target = input.replaceAll("[0-9]","");

        if(target == "" || target.length() == 0){
            throw new IllegalArgumentException();
        }

        return target;
    }
}

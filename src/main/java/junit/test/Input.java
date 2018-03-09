package junit.test;

import java.util.Scanner;

public class Input {
    public static String scanInput(){
        try(Scanner scan = new Scanner(System.in)){

            return scan.nextLine();
        }
    }
    public static int[] convertToInt(String s){
        int[] numbers = new int[2];
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }
        return numbers;
    }
}


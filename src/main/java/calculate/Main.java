package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        System.out.print(Calculator.calculate(sentence));
    }

}



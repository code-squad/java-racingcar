package stringcalculator;

import java.util.Scanner;

public class Main {

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사칙연산할 문자열을 입력하시오 ex) 2 + 3 * 4 / 2");
        return sc.nextLine();
    }

    public static void main(String[] args){
        StringCalculator cal = new StringCalculator();
        System.out.println(cal.run(inputString()));
    }
}

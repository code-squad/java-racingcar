package calculator;

import java.util.Scanner;

/**
 * Created by Administrator on 2018-03-31.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        String input1 = sc.nextLine();

        System.out.println("+, -, *, / 연산을 선택하세요 ");
        String operator = sc.nextLine();

        System.out.println("숫자를 입력하세요 : ");
        String input2 = sc.nextLine();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        Calculator cal = new Calculator();

        if (operator.equals("+")) {
            System.out.println(cal.add(num1, num2));
        }

        if (operator.equals("-")) {
            System.out.println(cal.subtract(num1, num2));
        }

        if (operator.equals("*")) {
            System.out.println(cal.multiply(num1, num2));
        }

        if (operator.equals("/")) {
            System.out.println(cal.devide(num1, num2));
        }
    }

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int devide(int num1, int num2){
        return num1 / num2;
    }
}

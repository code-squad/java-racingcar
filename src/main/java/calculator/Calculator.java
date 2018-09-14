package calculator;

import java.util.Scanner;

public class Calculator {
    public static final String[] operations = {"+", "-", "*", "/"};

    private int answer = 0;
    private String[] values;

    public void init(String value) {
        values = value.split(" ");
        answer = Integer.parseInt(values[0]);
    }

    public int add(int answer, int value) {
        return answer + value;
    }

    public int subtract(int answer, int value) {
        return answer - value;
    }

    public int multiply(int answer, int value) {
        return answer * value;
    }

    public int divide(int answer, int value) {
        return answer / value;
    }

    public int isOperation(String value) {
        for (int i = 0; i < operations.length; i++) {
            if (value.equals(operations[i])) {
                return i;
            }
        }
        return -1;
    }

    public void operate(int index, int operationNo) {
        switch (operationNo) {
            case 0:
                answer = add(answer, Integer.parseInt(values[index + 1]));
                break;
            case 1:
                answer = subtract(answer, Integer.parseInt(values[index + 1]));
                break;
            case 2:
                answer = multiply(answer, Integer.parseInt(values[index + 1]));
                break;
            case 3:
                answer = divide(answer, Integer.parseInt(values[index + 1]));
                break;
        }
    }

    public void run() {
        int index = 1;
        while (index < values.length) {
            String value = values[index];
            if (isOperation(value) != -1) {
                int operationNo = isOperation(value);
                operate(index, operationNo);
            }
            index = index + 2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("공백 단위로 계산하고 싶은 문자열을 입력해주세요");
        String value = scan.nextLine();

        Calculator calculator = new Calculator();
        calculator.init(value);
        calculator.run();
        System.out.println(calculator.answer);
    }
}

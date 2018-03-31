package caculator;


import com.oracle.tools.packager.Log;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
 * 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
 * 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
 */
public class Calc {

    public static void main(String[] args) {
        System.out.println(Calc.input("2 + 3 * 4 / 2"));
        System.out.println(Calc.input("2 + 3"));
    }

    private static int add(int i1, int i2) {
        return i1 + i2;
    }

    private static int minus(int i1, int i2) {
        return i1 - i2;
    }

    private static int multiply(int i1, int i2) {
        return i1 * i2;
    }

    private static int divide(int i1, int i2) {
        return i1 / i2;
    }

    public static int calc(List<String> input, int acc, String symbol) {

        List<String> temp = input;

        if (temp.size() == 0) {
            return acc;
        }

        if (isNumeric(temp.get(0))) {
            int temp_num = Integer.parseInt(temp.get(0));
            temp.remove(0);
            return calc(temp, assertSymbol(symbol, acc, temp_num) , "");
        } else {
            String temp_symbol = temp.get(0);
            temp.remove(0);
            return calc(temp, acc, temp_symbol);
        }
    }

    public static int input(String input) {
        return calc(new ArrayList<String>(Arrays.asList(input.split(" "))), 0, "");
    }

    public static int assertSymbol(String symbol, int i1, int i2) {
        switch (symbol) {
            case "+":
                return add(i1, i2);

            case "-":
                return minus(i1, i2);

            case "*":
                return multiply(i1, i2);

            case "/":
                return divide(i1, i2);

            default:
                return i2;
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}

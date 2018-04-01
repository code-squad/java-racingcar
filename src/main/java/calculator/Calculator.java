package calculator;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class Calculator {


    public int init(String str) {

        String[] values = split(str);

        int startNum = Integer.parseInt(values[0]);
        int result = startNum;

        for (int i = 1; i < values.length; i = i + 2) {
            String operator = values[i];
            result = calculate(result, Integer.parseInt(values[i+1]), operator);
        }

        return result;

    }

    private int calculate(int result, int num, String operator) {
        if ("+".equalsIgnoreCase(operator)) {
            return add(result, num);
        }
        if ("-".equalsIgnoreCase(operator)) {
            return sub(result, num);
        }
        if ("*".equalsIgnoreCase(operator)) {
            return mul(result, num);
        }
        return div(result, num);
    }


    private String[] split(String str) {
        return str.split(" ");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

}

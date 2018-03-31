package calculator;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class StringCalculator {


    public StringCalculator() {

    }

    public int init(String str) {

        String[] values = split(str);

        int startNum = Integer.parseInt(values[0]);
        int result = startNum;

        for (int i = 1; i < values.length; i = i + 2) {
            String operator =  values[i];
            result = calculate(values, result, i, operator);
        }

        return result;

    }

    private int calculate(String[] values, int result, int i, String operator) {
        switch (operator) {
            case "+":
                result = add(result, Integer.parseInt(values[i+1]));
                break;
            case "-":
                result = sub(result, Integer.parseInt(values[i+1]));
                break;
            case "*":
                result = mul(result, Integer.parseInt(values[i+1]));
                break;
            case "/":
                result = div(result, Integer.parseInt(values[i+1]));
                break;
        }
        return result;
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

package calculator;

/**
 * @author sangsik.kim
 */
public class Calculator {


    public static int calculate(String text) {
        String[] values = text.split(" ");

        int result = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i].equals("+") || values[i].equals("-") || values[i].equals("*") || values[i].equals("/")) {
                result = calculation(Integer.parseInt(values[i - 1]), Integer.parseInt(values[i + 1]), values[i]);
                values[i + 1] = String.valueOf(result);
            }
        }
        return result;
    }

    private static int calculation(int firstNumber, int secondNumber, String operator) {
        if (operator.equals("+")) {
            return firstNumber + secondNumber;
        }
        if (operator.equals("-")) {
            return firstNumber - secondNumber;
        }
        if (operator.equals("*")) {
            return firstNumber * secondNumber;
        }
        if (operator.equals("/")) {
            return firstNumber / secondNumber;
        }
        return 0;
    }
}

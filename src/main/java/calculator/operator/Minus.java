package calculator.operator;

public class Minus implements Operator {
    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}

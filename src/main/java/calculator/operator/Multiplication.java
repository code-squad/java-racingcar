package calculator.operator;

public class Multiplication implements Operator {
    @Override
    public int operate(int a, int b) {
        return a * b;
    }
}

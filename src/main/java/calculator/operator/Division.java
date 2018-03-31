package calculator.operator;

public class Division implements Operator {

    @Override
    public int operate(int a, int b) {
        return a / b;
    }
}

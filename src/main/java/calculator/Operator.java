package calculator;

public interface Operator {
    int operate(int augend, int addend);
}


class AddOperator implements Operator {
    @Override
    public int operate(int augend, int addend) {
        return augend + addend;
    }
}

class SubtractOperator implements Operator {
    @Override
    public int operate(int augend, int addend) {
        return augend - addend;
    }
}

class DivideOperator implements Operator {
    @Override
    public int operate(int augend, int addend) {
        return augend / addend;
    }
}

class MultiplyOperator implements Operator {
    @Override
    public int operate(int augend, int addend) {
        return augend * addend;
    }
}

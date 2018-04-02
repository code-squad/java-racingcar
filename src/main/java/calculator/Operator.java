package calculator;

public interface Operator {

    int execute(int x, int y);


    class Add implements Operator {

        @Override
        public int execute(int x, int y) {
            return x + y;
        }
    }

    class Sub implements Operator {

        @Override
        public int execute(int x, int y) {
            return x - y;
        }
    }

    class Mul implements Operator {

        @Override
        public int execute(int x, int y) {
            return x * y;
        }
    }

    class Div implements Operator {

        @Override
        public int execute(int x, int y) {
            return x / y;
        }
    }
}

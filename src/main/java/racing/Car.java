package racing;

public class CarImpl implements Car {

    private final MoveStrategy moveStrategy;

    public CarImpl(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public int move() {
        int moveValue = moveStrategy.move();

        if (moveValue >= 4) {
            return moveValue;
        }

        return 0;
    }

}

package racing;

public class Car {

    private final MoveStrategy moveStrategy;

    public Car(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public int move() {
        int moveValue = moveStrategy.move();

        if (moveValue >= 4) {
            return moveValue;
        }

        return 0;
    }

}

package racing;

public class Car {

    private final MoveStrategy strategy;

    public Car(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public int move() {
        int moveValue = strategy.go();

        if (moveValue >= 4) {
            return moveValue;
        }

        return 0;
    }

}

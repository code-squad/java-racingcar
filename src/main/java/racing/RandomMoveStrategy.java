package racing;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {

    private final Random random = new Random();

    private static final MoveStrategy instance = new RandomMoveStrategy();

    private RandomMoveStrategy() {
    }

    public static MoveStrategy getInstance() {
        return instance;
    }

    @Override
    public int go() {
        return random.nextInt(10);
    }
}

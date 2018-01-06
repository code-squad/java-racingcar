package racing;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {

    private final Random random = new Random();

    @Override
    public int go() {
        return random.nextInt(10);
    }
}

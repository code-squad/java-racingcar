package racing;

import java.util.Random;

public class SimpleDeciderToGo implements DeciderToGo {
    private static final int RANDOM_MAX = 9;
    private static final int GO_THRESHOLD = 4;
    private Random random;

    SimpleDeciderToGo() {
        random = new Random();
    }

    @Override
    public boolean canWeGo() {
        int random = getRandom();

        return random >= GO_THRESHOLD;
    }

    private int getRandom() {
        return random.nextInt(RANDOM_MAX + 1);
    }

    @Override
    public int moveOrStop(int movement) {
        return moveOrStop(canWeGo(), movement);
    }

    int moveOrStop(boolean go, int movement) {
        if (go) {
            movement++;
        }

        return movement;
    }
}

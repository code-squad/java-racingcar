package racing;

import java.util.Random;

public class SimpleDeciderToGo implements DeciderToGo {
    private static final int RANDOM_MAX = 9;
    private static final int GO_THRESHOLD = 4;

    private Random random;

    public SimpleDeciderToGo() {
        random = new Random();
    }

    @Override
    public boolean isPossibleToGo() {
        int random = getRandom();

        return random >= GO_THRESHOLD;
    }

    private int getRandom() {
        return random.nextInt(RANDOM_MAX + 1);
    }
}

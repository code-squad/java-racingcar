package racing.speed;

import java.util.Random;

public class SpeedImpl implements Speed {

    @Override
    public int fullAccel() {
        return new Random().nextInt(10);
    }
}

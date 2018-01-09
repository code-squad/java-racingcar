package random;

import java.util.Random;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2018-01-09
 */
public class CarRandomUtils {
    public static int makeRandomNumber(int range) {
        return new Random().nextInt(range);
    }
}

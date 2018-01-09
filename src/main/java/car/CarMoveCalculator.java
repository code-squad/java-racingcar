package car;

import random.CarRandomUtils;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2018-01-09
 */
public class CarMoveCalculator {

    public static int calculatePosition(int range, int isMovablesStandard) {
        return isMovable(CarRandomUtils.makeRandomNumber(range), isMovablesStandard) ? 1 : 0;
    }

    public static boolean isMovable(int random, int standard) {
        return random > standard;
    }
}

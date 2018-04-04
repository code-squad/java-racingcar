package game;

public class GameRule {

    public static final int START_POSITION = 0;
    public static final int MAX_RANDOM_VALUE = 10;

    private static final int MOVE_CONDITION = 4;

    public static boolean canMove(int randomValue) {
        return MOVE_CONDITION <= randomValue && randomValue < MAX_RANDOM_VALUE;
    }
}

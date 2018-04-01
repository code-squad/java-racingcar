package race;

interface RaceRule {
    boolean canMove(int randomValue);
}

class DefaultRaceRule implements RaceRule {
    private static final int LIMIT_VALUE = 4;

    @Override
    public boolean canMove(int randomValue) {
        return randomValue >= LIMIT_VALUE;
    }
}

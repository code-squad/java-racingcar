package race;

interface MoveRule {
    boolean canMove(int randomValue);
}

class DefaultMoveRule implements MoveRule {
    @Override
    public boolean canMove(int randomValue) {
        return randomValue >= 4;
    }
}

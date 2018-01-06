package racing;

public interface DeciderToGo {
    boolean canWeGo();
    int moveOrStop(boolean go, int movement);
}

package racingcar;

public class GameResult {

    private int[] carPosition;

    public GameResult(int[] carPosition) {
        this.carPosition = carPosition;
    }

    public int[] getCarPosition() {
        return carPosition;
    }

    public int getCarPostionLength() {
        return carPosition.length;
    }

    public int getSingleCarPosition(int line) {
        return carPosition[line];
    }
}

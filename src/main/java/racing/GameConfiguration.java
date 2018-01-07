package racing;

public class GameConfiguration {
    private int carCount;
    private int tryCount;

    public GameConfiguration(int carCount, int tryCount) {
        this.carCount = carCount;
        this.tryCount = tryCount;
    }

    public int getCarCount() {
        return carCount;
    }

    public int getTryCount() {
        return tryCount;
    }
}

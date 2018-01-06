package racing;

public class GameConfiguration {
    private int carCount;
    private int tryCount;

    GameConfiguration(int carCount, int tryCount) {
        this.carCount = carCount;
        this.tryCount = tryCount;
    }

    int getCarCount() {
        return carCount;
    }

    int getTryCount() {
        return tryCount;
    }
}

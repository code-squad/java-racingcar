package racingcar;

public class RacingGameInfoDTO {
    private int countOfCar;
    private int testCase;

    public int getCountOfCar() {
        return countOfCar;
    }

    public RacingGameInfoDTO setCountOfCar(int countOfCar) {
        this.countOfCar = countOfCar;
        return this;
    }

    public int getTestCase() {
        return testCase;
    }

    public RacingGameInfoDTO setTestCase(int testCase) {
        this.testCase = testCase;
        return this;
    }
}

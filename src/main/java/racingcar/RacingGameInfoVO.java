package racingcar;

public class RacingGameInfoVO {
    private int countOfCar;
    private int testCase;

    public int getCountOfCar() {
        return countOfCar;
    }

    public RacingGameInfoVO setCountOfCar(int countOfCar) {
        this.countOfCar = countOfCar;
        return this;
    }

    public int getTestCase() {
        return testCase;
    }

    public RacingGameInfoVO setTestCase(int testCase) {
        this.testCase = testCase;
        return this;
    }
}

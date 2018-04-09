package racingcar;

public class TestRacingGame extends RacingGame {

    public TestRacingGame(int carCnt) {
        super(carCnt);
    }

    @Override
    int getRandomValue(){
        return 5; // 무조건 전진
    }
}

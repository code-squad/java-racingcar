package racingcar;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    private static final String[] INPUT_NAME = {"a","b","c","d","e"};
    private static final int TEST_CASE = 100;
    private RacingGame game;

    @Before
    public void init() {
        game = new RacingGame();
    }

    @Test
    public void fiveTimeTest() {
        for (int i = 0; i < TEST_CASE; i++) {
            game.initCars(INPUT_NAME);
            game.run(5);
            assertTrue(game.getBestPosition() >= 1);
            assertTrue(game.getBestPosition() <= 6);
        }
    }

    @Test
    public void zeroTimeTest() {
        game.initCars(INPUT_NAME);
        game.run(0);
        assertEquals(game.getBestPosition(), 1);
    }

    @Test
    public void getBestPositionTest(){
        game.initCars(INPUT_NAME);
        game.run(5);
        ArrayList<Result> resultList = game.returnResult();
        int maxValue = Integer.MIN_VALUE;
        for (Result result : resultList) {
            maxValue = Math.max(maxValue, result.getPosition());
        }
        assertEquals(maxValue, game.getBestPosition());
    }

    @Test
    public void resultAndWinnerMatchTest(){
        game.initCars(INPUT_NAME);
        game.run(5);
        int bestPosition = game.getBestPosition();
        ArrayList<Result> resultList = game.returnResult();
        ArrayList<String> winnerList = game.returnWinner();
        for (Result result : resultList) {
            if (result.getPosition() == bestPosition) {
                assertTrue(winnerList.contains(result.getName()));
            }
        }

    }
}

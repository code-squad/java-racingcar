package racing;

import org.junit.Test;
import racing.model.GameConfiguration;

import static org.junit.Assert.*;

public class MoverTest {
    private Mover mover;

    @Test
    public void move() throws Exception {
        mover = new Mover(new SimpleDeciderToGo());

        for (int i=10; i<1000; i++) {
            assertTrue(checkMove("a,b", 2, i));
            assertTrue(checkMove("a,b,c,d", 4, i));
            assertTrue(checkMove("a,b,c,d,e,f,g", 7, i));
        }
    }

    private boolean checkMove(String carNameString, int carCount, int tryCount) {
        String[] carNames = carNameString.split(",");

        GameConfiguration gameConfiguration = new GameConfiguration(carNames, tryCount);
        mover.move(gameConfiguration);

        assertTrue(gameConfiguration.getCars().size() == carCount);

        // jdk 7
//        for (Car car : gameConfiguration.getCars()) {
//            checkMaxMove(i, car.getPosition());
//        }

        gameConfiguration.getCars()
                .forEach(car -> checkMaxMove(tryCount, car.getPosition()));

        return true;
    }

    private void checkMaxMove(int i, Integer move) {
        assertFalse(move > i);
    }
}

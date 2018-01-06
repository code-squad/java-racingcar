package game;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {

  private RacingGame racingGame;

  @Before
  public void setUp() throws Exception {
    racingGame = new RacingGame(3, 5);
  }

  @Test
  public void move() {
    assertArrayEquals(new int[]{1, 1, 1}, racingGame.move());
    assertArrayEquals(new int[]{2, 2, 2}, racingGame.move());
  }

  @Test
  public void generateRandomIntValue() {
    for (int i = 0; i < 1000; i++) {
      int value = RacingGame.generateRandomIntValue();
      assertTrue(value >= 0 && value < 10);
    }
  }
}

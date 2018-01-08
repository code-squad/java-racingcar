package game;

import static org.junit.Assert.assertEquals;

import car.Car;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {

  private RacingGame racingGame;

  @Before
  public void setUp() throws Exception {
    List<Car> cars = RacingGameCarFactory.createCars("ggulmool,javajigi,thekarin");
    racingGame = new RacingGame(cars, 5);
  }

  @Test
  public void racing_all_5회_전진() {
    List<Result> results = racingGame.racing(() -> 5);

    assertEquals("ggulmool", results.get(0).getName());
    assertEquals(5, results.get(0).getPosition());

    assertEquals("javajigi", results.get(1).getName());
    assertEquals(5, results.get(1).getPosition());

    assertEquals("thekarin", results.get(2).getName());
    assertEquals(5, results.get(2).getPosition());
  }
}

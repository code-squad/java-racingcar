package game;

import static org.junit.Assert.assertEquals;

import car.Car;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {

  private RacingGame racingGame;
  private List<Car> cars;

  @Before
  public void setUp() throws Exception {
    cars = RacingGameCarFactory.createCars("ggulmool,javajigi,thekarin");
  }

  @Test
  public void winner_한명() {
    IntStream.range(0, cars.size())
        .forEach(i -> {
          cars.get(i).setMoveCondition(() -> i + 2);
        });

    racingGame = new RacingGame(cars, 5);
    racingGame.racing();
    assertEquals("thekarin", racingGame.getWinner());
  }

  @Test
  public void winner_공동우승() {
    IntStream.range(0, cars.size())
        .forEach(i -> {
          cars.get(i).setMoveCondition(() -> i + 3);
        });

    racingGame = new RacingGame(cars, 5);
    racingGame.racing();
    assertEquals("javajigi,thekarin", racingGame.getWinner());
  }

  //TODO:RandomMoveCondition의 경우에 어떻게 테스트 할수 있을까?
}

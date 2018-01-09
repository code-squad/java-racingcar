package game;

import static org.junit.Assert.assertEquals;

import car.Car;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ResultViewTest {

  private ResultView resultView;
  private RacingGame racingGame;

  @Before
  public void setUp() throws Exception {
    String names = "ggulmool,javajigi,thekarin";
    List<Car> cars = RacingGameCarFactory.createCars(names);
    racingGame = new RacingGame(cars, 5);
    resultView = new ResultView(names);
  }

  @Test
  public void resultView_생성_초기화() {
    assertEquals(3, resultView.getResults().size());
    assertEquals("ggulmool", resultView.getResults().get(0).getName());
  }

  @Test
  public void drawResultUI() {
    List<Result> results = racingGame.racing(() -> 5);
    resultView.setResults(results);

    String expected = "ggulmool : -----\njavajigi : -----\nthekarin : -----\n";
    assertEquals(expected, resultView.drawResultUI());
  }

  @Test
  public void winner_공동우승() {
    List<Result> results = racingGame.racing(() -> 5);
    resultView.setResults(results);
    assertEquals("ggulmool,javajigi,thekarin", resultView.getWinner());
  }
}

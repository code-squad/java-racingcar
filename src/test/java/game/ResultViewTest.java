package game;

import static org.junit.Assert.assertEquals;

import car.Car;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ResultViewTest {

  private ResultView resultView;

  @Before
  public void setUp() throws Exception {
    resultView = new ResultView();
  }

  @Test
  public void drawView() {
    List<Car> cars = RacingGameCarFactory.createCars("ggulmool,javajigi,thekarin");

    for (Car car : cars) {
      car.setMoveCondition(() -> 4);
      car.move();
      car.setMoveCondition(() -> 3);
      car.move();
      car.setMoveCondition(() -> 4);
      car.move();
    }

    String expected = "ggulmool : --\njavajigi : --\nthekarin : --\n";
    assertEquals(expected, resultView.drawRaceResultView(cars));
  }
}

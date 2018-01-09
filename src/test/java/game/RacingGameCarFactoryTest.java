package game;

import static org.junit.Assert.assertEquals;

import car.Car;
import java.util.List;
import org.junit.Test;

public class RacingGameCarFactoryTest {

  @Test
  public void createCars() {
    String carNames = "ggulmool,javajigi,thekarin";
    List<Car> result = RacingGameCarFactory.createCars(carNames);
    assertEquals(3, result.size());
  }
}
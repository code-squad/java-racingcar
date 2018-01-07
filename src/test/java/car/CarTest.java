package car;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

  private Car car;

  @Before
  public void setUp() throws Exception {
    car = new Car();
  }

  @Test
  public void moved_position() {
    assertEquals(1, car.move(4));
    assertEquals(1, car.move(3));
    assertEquals(2, car.move(4));
  }
}
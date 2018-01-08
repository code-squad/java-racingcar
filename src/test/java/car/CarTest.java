package car;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

  private Car car;

  @Before
  public void setUp() throws Exception {
    car = new Car("ggulmool");
  }

  @Test
  public void move_전진_멈춤_전진() {
    assertEquals(1, car.move(4));
    assertEquals(1, car.move(3));
    assertEquals(2, car.move(4));
  }
}
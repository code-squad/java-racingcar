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
  public void move_condition_4이상() {
    car.setMoveCondition(() -> 4);
    assertEquals(1, car.move());
    car.setMoveCondition(() -> 3);
    assertEquals(1, car.move());
    car.setMoveCondition(() -> 4);
    assertEquals(2, car.move());
  }
}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racingcar.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;

    @Before
    public void setUp() {
        car = new Car("forever");
    }

    @Test
    public void countCarTest() {
        int result1 = car.countMove(0, 5);
        assertThat(result1).isEqualTo(1);

        int result2 = car.countMove(0, 4);
        assertThat(result2).isEqualTo(1);

        int result3 = car.countMove(0, 3);
        assertThat(result3).isEqualTo(0);
    }

    @After
    public void endTest() {
        System.out.println("Test End!");
    }
}
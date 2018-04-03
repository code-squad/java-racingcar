package racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrinterTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @Test
    public void 한대출력() {
        Car car = new Car();
        car.setPosition(4);
        assertThat(Printer.print(car) == 4);
    }

    @Test
    public void 여러대출력() {
        List<Car> cars = new ArrayList();
        cars.add(new Car(3));
        cars.add(new Car(0));
        cars.add(new Car(5));
        assertThat(Printer.printAll(cars) == 8);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }
}

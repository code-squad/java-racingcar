import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Created by hoon on 2018. 1. 6..
 */
public class CarTest {

    private Car car;

    @Before
    public void setup() {
        car = new Car("test");
    }

    @Test
    public void 랜덤숫자가_4이상일때만_움직인다() {
        car.move(3);
        assertEquals(0, car.getPosition());
        car.move(4);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void 랜덤숫자가_0에서_9인지() {
        for(int i = 0; i < 10000; i++) {
            int random = Utils.getRandomNumber();
            assertTrue(random >= 0 && random < 10);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void split_with_comma_테스트() {
        Utils.splitWithDelimiter("", ",");
        Utils.splitWithDelimiter(null, ",");
    }

    @Test
    public void 내림차순_정렬_테스트() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("류광현");
        Car car2 = new Car("강지선");
        Car car3 = new Car("조정훈");

        car1.move(3);
        car2.move(4);
        car3.move(4);
        car3.move(4);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        List<Car> sortedCars = Utils.sortByPositionDesc(cars);

        assertEquals("조정훈", sortedCars.get(0).getName());
        assertEquals("강지선", sortedCars.get(1).getName());
        assertEquals("류광현", sortedCars.get(2).getName());
    }

}
package racing.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarList {

    private List<Car> cars;

    public CarList(int count) {
        cars = new ArrayList<>();
        for(int i=0; i < count; i++) {
            cars.add(new Car());
        }
    }

    public void moveAll() {
        cars.forEach(car -> car.move());
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}

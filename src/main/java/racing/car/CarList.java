package racing.car;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarList {

    private final List<Car> cars;

    public CarList(int count) {
        cars = new ArrayList<>();
        for(int i=0; i < count; i++) {
            cars.add(new Car());
        }
    }

    public int size() {
        return cars.size();
    }

    public boolean isEmpty() {
        return cars.isEmpty();
    }

    public void moveAll() {
        cars.forEach(car -> car.move());
    }

    public void forEach(@Nonnull Consumer<? super Car> action) {
        cars.forEach(action);
    }


}

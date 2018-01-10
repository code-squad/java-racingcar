package racing.car;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    public CarList(String[] names) {
        cars = Arrays.stream(names)
                .map(CarFactory::createCar)
                .collect(Collectors.toList());
    }

    public CarList(List<Car> cars) {
        this.cars = new ArrayList<>();
        this.cars.addAll(cars);
    }

    public List<Car> getWinners() {
        int max = getMaxPosition();
        if(max < 0)
            return new ArrayList<>();
        return cars.stream()
                .filter(isFirstPosition(max))
                .collect(Collectors.toList());
    }

    private Predicate<Car> isFirstPosition(int max) {
        return car -> car.getPosition() == max;
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(car -> car.getPosition())
                .max().orElse(-1);
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

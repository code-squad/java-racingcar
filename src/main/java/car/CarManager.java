package car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarManager {
    private List<Car> cars;
    private int tryNumber;

    public CarManager(int carSize, int tryNumber) {
        this.cars = createCarBySize(carSize);
        this.tryNumber = tryNumber;
    }

    public void moveCars() {
        cars.forEach(car -> car.move(this.tryNumber));
    }

    public List<Car> createCarBySize(int carSize) {
        return IntStream.range(0, carSize).mapToObj(i->new Car()).collect(Collectors.toList());
    }

    public void printCars(){
        cars.forEach(car -> car.printMove());
    }

    public List<Car> getCars() {
        return cars;
    }
}

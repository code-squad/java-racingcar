package car;

import out.Output;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Race {

    private List<Car> cars;
    private int tryNumber;
    private int isMovablesRange;
    private int isMovablesStandard;

    public Race(int carSize, int tryNumber, int isMovablesRange, int isMovablesStandard) {
        this.cars = createCarBySize(carSize);
        this.tryNumber = tryNumber;
        this.isMovablesRange = isMovablesRange;
        this.isMovablesStandard = isMovablesStandard;
    }

    public void moveCars() {
        IntStream.range(0, this.tryNumber).forEach(i -> cars.forEach(car -> car.move(CarMoveCalculator.calculatePosition(isMovablesRange, isMovablesStandard))));
    }

    private List<Car> createCarBySize(int carSize) {
        return IntStream.range(0, carSize).mapToObj(i -> new Car()).collect(Collectors.toList());
    }

    public void printCars() {
        cars.forEach(car -> Output.printMove(car.getPosition()));
    }

    public List<Car> getCars() {
        return cars;
    }
}

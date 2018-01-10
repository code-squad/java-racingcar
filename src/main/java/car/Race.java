package car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Race {

    private List<Car> cars;
    private int tryNumber;
    private int isMovablesRange;
    private int isMovablesStandard;

    public Race(List<String> carNames, int tryNumber, int isMovablesRange, int isMovablesStandard) {
        this.cars = createCars(carNames);
        this.tryNumber = tryNumber;
        this.isMovablesRange = isMovablesRange;
        this.isMovablesStandard = isMovablesStandard;
    }

    private void moveCars(List<Car> cars){
        cars.forEach(car -> car.move(CarMoveCalculator.calculatePosition(isMovablesRange, isMovablesStandard)));
    }

    public void startRacing() {
        IntStream.range(0, this.tryNumber).forEach(i -> moveCars(cars));
    }

    public List<Car> calCulateWinners(List<Car> cars, int maxPosition){
        return cars.stream().filter(car->car.getPosition() == maxPosition).collect(Collectors.toList());
    }

    private Car getMaxPositionCar(List<Car> cars) {
        return cars.stream().max(Car::compareTo).orElse(new Car("",0));
    }

    private List<Car> createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        carNames.forEach(carName->cars.add(new Car(carName,0)));
        return cars;
    }

    public void printRacing(){
        printCarsMove();
        printWinner();
    }

    private void printCarsMove() {
        cars.forEach(car -> System.out.println(car.toString()));
    }

    private void printWinner() {
        System.out.println("");
        for(Car car: calCulateWinners(this.cars, getMaxPositionCar(cars).getPosition())){
            System.out.print(car.getName() + " ");
        }
        System.out.print("가 최종 우승하셨습니다");
        System.out.println("");
    }

    public List<Car> getCars() {
        return cars;
    }
}

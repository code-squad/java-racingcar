package car;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> cars;
    private int carSize;
    private int tryNumber;

    public CarManager(int carSize, int tryNumber) {
        this.cars = new ArrayList<>();
        this.carSize = carSize;
        this.tryNumber = tryNumber;
    }

    public void moveCars() {
        for(Car car:cars){
            car.move(this.tryNumber);
        }
    }

    public void createCarBySize() {
        for(int i=0;i<this.carSize;i++){
            cars.add(new Car());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}

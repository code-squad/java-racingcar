package car;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> cars;


    public CarManager() {
        this.cars = new ArrayList<>();
    }

    public void moveCars(int tryNumber) {
        for(Car car:cars){
            car.move(tryNumber);
        }
    }

    public void createCarBySize(int carSize) {
        for(int i=0;i<carSize;i++){
            cars.add(new Car());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}

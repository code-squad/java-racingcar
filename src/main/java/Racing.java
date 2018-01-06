import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by hoon on 2018. 1. 6..
 */
public class Racing {

    private int moveNums;

    private static List<Car> cars = new ArrayList<>();

    public Racing() {}

    public Racing(int carNums, int moveNums) {
        this.moveNums = moveNums;
        generateCars(carNums);
    }


    public List<Car> getCars() {
        return cars;
    }

    private void generateCars(int carNums) {
        for(int i = 0; i < carNums; i++) {
            cars.add(new Car());
        }
    }

    public void doRace() {
        for(int i = 0; i < this.moveNums; i++) {
            for(Car car : cars) {
                car.move();
            }
        }
    }

    public void printResult() {
        for(Car car : cars) {
            car.print();
        }
    }

}

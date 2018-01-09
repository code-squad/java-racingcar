import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoon on 2018. 1. 6..
 */
public class Racing {

    private Integer repeatNum;

    private List<Car> cars;

    public Racing() {}

    public Racing(Integer carNum, Integer repeatNum) {
        this.repeatNum = repeatNum;
        this.cars = generateCars(carNum);
    }


    public List<Car> getCars() {
        return cars;
    }

    private List<Car> generateCars(Integer carNum) {
        List<Car> cars = new ArrayList<>();
        for(int i = 0; i < carNum; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    public List<Car> doRace() {
        for(int i = 0; i < repeatNum; i++) {
            phase();
        }
        return cars;
    }

    private List<Car> phase() {
        for(Car car : cars) {
            car.move(Utils.getRandomNumber());
        }
        return cars;
    }

}

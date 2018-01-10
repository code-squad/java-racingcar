import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoon on 2018. 1. 6..
 */
public class Racing {

    private Integer repeatNum;

    private List<Car> cars;

    public Racing() {}

    public Racing(String carNames, Integer repeatNum) {
        this.repeatNum = repeatNum;
        this.cars = generateCars(carNames);
    }


    public List<Car> getCars() {
        return cars;
    }

    private List<Car> generateCars(String carNames) {
        String[] names = Utils.splitWithComma(carNames);
        List<Car> cars = new ArrayList<>();
        for(int i = 0; i < names.length; i++) {
            cars.add(new Car(names[i]));
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

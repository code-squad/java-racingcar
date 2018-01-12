import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoon on 2018. 1. 6..
 */
public class Racing {

    private Integer repeatNum;

    private List<Car> cars;

    public Racing() {}

    public Racing(List<Car> cars, Integer repeatNum) {
        this.repeatNum = repeatNum;
        this.cars = cars;
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
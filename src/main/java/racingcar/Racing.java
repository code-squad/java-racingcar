package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private List<Car> cars = new ArrayList<>();


    public Racing(String[] carNames) {
        for (String carName : carNames) {
            this.cars.add(new Car(carName));
        }
    }

    public List<Car> run(int time) {
        for (int i = 0; i < time; i++) {
            turn();
        }
        return this.cars;
    }

    public void turn() {
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).move();
        }
    }

}

package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private int time;
    private List<Car> cars = new ArrayList<>();


    public Racing(int time, String[] carNames) {
        this.time = time;
        for (int i = 0; i < carNames.length; i++) {
            this.cars.add(new Car(carNames[i]));
        }
    }

    public void run() {
        for (int i = 0; i < this.time; i++) {
            turn();
        }
    }

    public void turn() {
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).move();
        }
    }

    public List<Car> getCars() {
        return this.cars;
    }

}

package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private static final int MAXRANDNUM = 10;
    private List<Car> cars = new ArrayList<>();

    public Racing(String[] carNames) {
        for (String carName : carNames) {
            this.cars.add(new Car(carName));
        }
    }

    // test를 위한 리턴값 지정
    public int makeRandNum(){
        Random random = new Random();
        return random.nextInt(MAXRANDNUM);
    }

    public List<Car> run(int time) {
        for (int i = 0; i < time; i++) {
            turn();
        }
        return this.cars;
    }

    public void turn() {
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).move(makeRandNum());
        }
    }

}

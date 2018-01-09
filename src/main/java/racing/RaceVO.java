package racing;

import java.util.ArrayList;
import java.util.List;

public class RaceVO {
    private int carCount;
    private int maxMoveCount;
    private List<Car> cars;

    public RaceVO() {
    }

    public int getCarCount() {
        return carCount;
    }

    public int getMaxMoveCount() {
        return maxMoveCount;
    }

    public void setCarCount(int count) {
        this.carCount = count;
    }

    public void setMaxMoveCount(int count) {
        this.maxMoveCount = count;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void enrollCars() {
        if (getCarCount() == 0) throw new RuntimeException("carCount가 0 입니다. initRace 메소드를 실행 후 진행하세요.");
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < getCarCount(); i++) {
            carList.add(new Car());
        }
        this.cars = carList;
    }
}

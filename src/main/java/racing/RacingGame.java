package racing;

import car.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int tryCount;
    private List<Car> carList;

    public RacingGame(int numberOfCars, int tryCount) {
        if(numberOfCars < 0 || tryCount < 0)
            throw new IllegalArgumentException("Invalid inputs");

        this.tryCount = tryCount;
        carList = new ArrayList<>();

        for(int i = 0 ; i < numberOfCars ; ++i)
            carList.add(new Car());
    }

    public void playRacing() {
        for(int i = 0 ; i < tryCount ; ++i)
            tryToMoveCarList();
    }

    private void tryToMoveCarList() {
        for(Car car : carList)
            car.tryMove();
    }

    public void showState() {
        System.out.println("실행 결과");
        for(Car car : carList)
            System.out.println(car);
    }
}

package racing.game;

import racing.car.Car;
import racing.car.CarList;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class ResultView {

    private final CarList carList;

    public ResultView(CarList carList) {
        this.carList = carList;
    }

    public void printResult() {
        carList.getCars().forEach(car -> {
            printCarNameAndPosition(car);
            System.out.println();
        });
    }

    private void printCarNameAndPosition(Car car) {
        System.out.print(car.getName() + ": ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
    }

}

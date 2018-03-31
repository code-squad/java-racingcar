package racingcar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sangsik.kim
 */
public class RacingGame {
    List<Car> cars;
    Integer time;

    public void start(Integer numberOfCars, Integer time) {
        initializeData(numberOfCars, time);

        while (hasAvailableTime()) {
            movingAllCars(cars);
            displayCurrentPositionOfAllCars(cars);
            spendTime();
        }
    }


    /******************************************************************************************
     * 이하 private method                                                                    *
     ******************************************************************************************/

    public void initializeData(Integer numberOfCars, Integer time) {
        this.cars = generateCars(numberOfCars);
        this.time = time;
    }

    public List<Car> generateCars(Integer numbersOfCar) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < numbersOfCar; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    public Boolean hasAvailableTime() {
        return this.time > 0;
    }

    public void spendTime() {
        if (this.time > 0) {
            this.time--;
        }
    }

    public void movingAllCars(List<Car> cars) {
        for (Car car : cars) {
            car.move();
        }
    }

    public void displayCurrentPositionOfAllCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(convertingPositionNumberToHyphen(car.getCurrentPosition()));
        }
        System.out.println("");
    }


    public String convertingPositionNumberToHyphen(Integer position) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < position; i++) {
            result.append("-");
        }
        return result.toString();
    }


}

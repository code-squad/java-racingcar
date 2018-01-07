package racing;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class RacingGame {

    private ArrayList<Car> carList = new ArrayList<>();
    private int tryCount;

    public RacingGame(int countOfCar, int tryCount) {
        for(int i=0; i<countOfCar; i++) {
            Car car = new Car();
            carList.add(car);
        }
        this.tryCount = tryCount;
    }


    public void racing(int tryCount, Car car) {

        for(int i = 0; i<tryCount; i++) {
            moveByRandomValue(car ,generateRandomValue());
        }
    }

    public boolean moveByRandomValue(Car car, int randomValue) {
        if(randomValue >= 4) {
            car.move();
            return true;
        }
        return false;
    }

    public static int generateRandomValue() {

        return new Random().nextInt(10);
    }



    public void printCarsDistance() {

        System.out.println("실행 결과");
        for(Car car:carList) {
            car.showDistance();
            System.out.println();
        }
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }
}

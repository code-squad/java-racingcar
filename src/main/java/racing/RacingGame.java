package racing;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class RacingGame {

    private static ArrayList<Car> carList = new ArrayList<>();

    public void setCars(int countOfCar) {
        for(int i=0; i<countOfCar; i++) {
            Car car = new Car();
            carList.add(car);
        }
    }

    public void racing(int tryCount, Car car) {
        Random rand;

        for(int i = 0; i<tryCount; i++) {
            rand =  new Random();
            int value = rand.nextInt(10);

            if(value >= 4) {
                car.move();
            }
        }
    }

    public void printCarsDistance(ArrayList<Car> carList) {

        System.out.println("실행 결과");
        for(Car car:carList) {
            car.showDistance();
            System.out.println();
        }
    }

    public static ArrayList<Car> getCarList() {
        return carList;
    }
}

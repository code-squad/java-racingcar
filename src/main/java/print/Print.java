package print;

import car.Car;

import java.util.List;

public class Print {

    public void printCarsMove(List<Car> cars) {
        cars.forEach(car -> System.out.println(car.toString()));
    }

    public void printWinner(List<Car> winners) {
        System.out.println("");
        for(Car car: winners){
            System.out.print(car.getName() + " ");
        }
        System.out.print("가 최종 우승하셨습니다");
        System.out.println("");
    }
}

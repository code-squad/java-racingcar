import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int carsCount = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = sc.nextInt();
        List<Car> cars = makeCars(carsCount);
        moveCars(cars, tryCount);

        for(int i = 0; i < carsCount; i++){
            Car car = cars.get(i);
            System.out.println(car + "의 위치는 " + car.getPosition() + " 입니다.");
        }
    }

    private static List<Car> makeCars(int count){
        List<Car> cars = new ArrayList<>();
        for(int i = 1; i <= count; i++){
            cars.add(new Car(i));
        }
        return cars;
    }

    private static void moveCars(List<Car> cars, int tryCount){
        while(tryCount > 0) {
            moveCar(cars);
            tryCount--;
        }
    }

    private static void moveCar(List<Car> cars){
        for(Car car : cars){
            car.move();
        }
    }
}

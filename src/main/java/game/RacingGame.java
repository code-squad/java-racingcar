package java.game;

import java.car.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingGame {
    private int numberOfCar;
    private int tryCount;
    private List<Car> carList;

    public void initGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        numberOfCar = sc.nextInt();
        System.out.println("시도할 회수는 몇 대 인가요?");
        tryCount = sc.nextInt();

        for(int i = 0 ; i < numberOfCar ; ++i) {
            this.carList.add(new Car());
        }
    }

    public RacingGame() {
        this.numberOfCar = 0;
        this.tryCount = 0;
        this.carList = new ArrayList<>();
    }

    public void playRacingGame() {
        while(tryCount-- > 0) {
            tryMoveCar();
        }
    }

    public void tryMoveCar() {
        for(Car car : carList)
            car.move();
    }

    public void printState() {
        for(Car car : carList)
            System.out.println(car);
    }
}

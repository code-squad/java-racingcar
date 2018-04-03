package racingGame;

import java.util.ArrayList;

public class Game {
    public void start(int time, int numberOfCars) { //레이싱 시작
        ArrayList<Car> cars = ready(numberOfCars);
        playGame(time, cars);
    }

    private void playGame(int time, ArrayList<Car> cars) {
        for(int i=0; i<time; ++i) {
            eachTimeMove(cars); //한 회 차들의 움직임
            Printer.printAll(cars); //현재 상태출력
        }
    }

    private void eachTimeMove(ArrayList<Car> cars) {
        for(Car car : cars) {
            car.move();
        }
    }

    private ArrayList<Car> ready(int numberOfCars) {
        ArrayList<Car> cars = new ArrayList();
        for(int i=0; i<numberOfCars; ++i) {
            cars.add(new Car());
        }
        return cars;
    }

}

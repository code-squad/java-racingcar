package racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InputView {

    public static final int MAX_NUMBER = 10;
    public static final int STANDARD = 4;

    ArrayList<Car> cars = new ArrayList<>();

    public ArrayList getCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        createCars(scanner.next());

        System.out.println("시도할 횟수는 몇 회 인가요?");
        int time = scanner.nextInt();

        for (Car car : cars) {
            car.setPosition(setMoveCount(time));
        }

        return cars;
    }

    public void createCars(String input) {
        String[] names = input.split(",");

        for(int i = 0 ; i < names.length; i++) {
            cars.add(createCar(names[i]));
        }
    }

    public Car createCar(String name) {
        Car car = new Car(name);
        return car;
    }


    public int setMoveCount(int time) {
        int move = 0;
        for (int i = 0; i < time; i++) {
            move += moveCount();
        }
        return move;
    }

    public int moveCount() {
        int move = 0;
        Random random = new Random();
        int randomNum = random.nextInt(MAX_NUMBER);

        if(randomNum >= STANDARD) {
            move = 1;
        }
        return move;
    }

}

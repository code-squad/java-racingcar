package racingcar.view;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static List<Car> getcars() {
        List<Car> cars = new ArrayList<>();
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        return makeCars(cars);
    }

    private static List<Car> makeCars(List<Car> cars) {
        for(String carName:scanner.nextLine().split(",")) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public static int getTryNo() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}

package racingcar.view;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static List<Car> getcars() {

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 띄어쓰기로 구분.");
        return makeCars(scanner.nextLine().split(" "));
    }

    public static List<Car> makeCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for(String carName:carNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public static int getTryNo() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}

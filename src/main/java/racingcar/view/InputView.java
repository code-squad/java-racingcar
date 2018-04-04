package racingcar.view;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        return makeCarList(carList);
    }

    private static List<Car> makeCarList(List<Car> carList) {
        for(String carName:scanner.nextLine().split(",")) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    public static int getTryNo() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}

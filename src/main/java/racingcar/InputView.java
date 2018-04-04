package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static List<Car> inputNameOfCar() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] carNames = sc.nextLine().split(",");
        return getCarInfoList(carNames);
    }

    private static List<Car> getCarInfoList(String[] carNames) {
        int countOfCar = carNames.length;
        List<Car> list = new ArrayList<Car>();
        for (int index = 0; index < countOfCar; index++) {
            list.add(new Car().setCarName(carNames[index]));
        }
        return list;
    }

    public static int inputTestCase() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }
}

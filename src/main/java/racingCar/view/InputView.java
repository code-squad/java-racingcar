package racingCar.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static List<String> setCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String inputString = scanner.nextLine();
        return splitCarsName(inputString);
    }

    public static List<String> splitCarsName(String inputString) {
        List<String> carsName = new ArrayList<>();
        String[] inputCarsName = inputString.split(",| ");
        for (String carName:inputCarsName) {
            carsName.add(carName);
        }
        return carsName;
    }

    public static int setTryNo() {
        System.out.println("시도할 횟수는 몇회입니까?.");
        return scanner.nextInt();
    }
}
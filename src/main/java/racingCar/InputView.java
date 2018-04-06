package racingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);
    private List<String> carsName = new ArrayList<>();
    private int times;

    public void setup() {
        settingCarsName();
        settingTime();
    }

    private void settingCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String inputString = scanner.nextLine();
        carInfoMapping(inputString);
    }

    private void settingTime() {
        System.out.println("시도할 횟수는 몇회입니까?.");
        times = scanner.nextInt();
    }

    private void carInfoMapping(String inputString) {
        String[] inputCarsName = inputString.split(",");
        for (String carName:inputCarsName) {
            carsName.add(carName);
        }
   }

    public int getTimes() {
        return times;
    }

    public List<String> getCarsName() {
        return carsName;
    }
}
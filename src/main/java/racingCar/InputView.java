package racingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private int carNumbers;
    private int times;
    private List<String> carNames = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

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
        this.times = scanner.nextInt();
    }

    private void carInfoMapping(String inputString) {

        String[] carNames = inputString.split(",");
        for (String carName:carNames) {
            this.carNames.add(carName);
        }
        carNumbers = this.carNames.size();
   }

    public int getCarNumbers() {
        return carNumbers;
    }

    public int getTimes() {
        return times;
    }

    public List<String> getCarNames() {
        return carNames;
    }
}
package racingCar;

import java.util.Scanner;

public class InputView {
    private int carNumbers;
    private int times;

    public void setup() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇대입니까.");
        this.carNumbers = scanner.nextInt();

        System.out.println("시도할 횟수는 몇회입니까?.");
        this.times = scanner.nextInt();
    }

    public int getCarNumbers() {
        return carNumbers;
    }

    public int getTimes() {
        return times;
    }
}
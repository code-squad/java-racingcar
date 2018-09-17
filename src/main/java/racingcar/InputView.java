package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    public static ArrayList<Car> cars = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static String inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public static ArrayList<Car> createCars(String inputName) {
        String[] names = inputName.split(",");
        for(int i = 0 ; i < names.length; i++) {
            cars.add(new Car(names[i]));
        }
        return cars;
    }

    public static int inputTime() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}

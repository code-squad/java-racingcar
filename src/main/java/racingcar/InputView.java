package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {

    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList getCars() {
        ArrayList<Car> cars;

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        cars = createCars(scanner.next());
        return cars;
    }

    public static ArrayList createCars(String input) {
        ArrayList<Car> cars = new ArrayList<>();
        String[] names = input.split(",");

        for(int i = 0 ; i < names.length; i++) {
            cars.add(new Car(names[i]));
        }
        return cars;
    }

    public static int getTime() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int time = scanner.nextInt();
        return time;
    }
}

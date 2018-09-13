package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {

    ArrayList<Car> cars = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList getCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        createCars(scanner.next());
        return cars;
    }

    public void createCars(String input) {
        String[] names = input.split(",");

        for(int i = 0 ; i < names.length; i++) {
            cars.add(new Car(names[i]));
        }
    }

    public int getTime() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int time = scanner.nextInt();
        return time;
    }
}

package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇대 인가요?");
        int number = scanner.nextInt();
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < number ; i++) {
            carList.add(new Car());
        }
        System.out.println("시도할 회수는 몇회 인가요?");
        int count = scanner.nextInt();

        for (int i = 0 ; i < count ; i++) {
            for (Car car : carList) {
                car.move();
            }
        }

        System.out.println("실행 결과");
        for (Car car : carList) { ;
            System.out.println(car.print());
        }
    }
}

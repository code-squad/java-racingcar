import car.Car;
import car.CarRacing;

import java.util.List;
import java.util.Scanner;

import static car.RacingUtils.*;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names[] = scanner.nextLine().split(REGEX);
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = scanner.nextInt();

        CarRacing carRacing = CarRacing.readyForRacing(tryCount);
        carRacing.createCarsByName(names);
        List<Car> cars = carRacing.startRacing();

        System.out.println("실행 결과");
        printRacingUi(cars);
        System.out.println(resultFormatting(carRacing.getWinners()));
    }
}

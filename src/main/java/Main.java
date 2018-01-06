import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Main {
    private static final String REGEX = ",";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names[] = scanner.nextLine().split(REGEX);
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = scanner.nextInt();

        IntStream.range(0, names.length).forEach(i -> carList.add(new Car(names[i])));
        IntStream.range(0, tryCount).forEach(i -> carList.stream().forEach(Car::randomMove));

        carList.stream().forEach(car -> System.out.println(formatting(car)));
    }

    private static String formatting(Car car) {
        return String.format("%s : %s", car.getName(), car.print());
    }
}

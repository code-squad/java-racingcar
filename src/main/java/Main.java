import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();

        System.out.println("자동차 대수는 몇 대 인가요?");
        int carLength = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = scanner.nextInt();

        IntStream.range(0, carLength).forEach(i -> carList.add(new Car()));
        IntStream.range(0, tryCount).forEach(i -> carList.stream().forEach(Car::randomMove));

        carList.stream().forEach(car -> System.out.println(car.print()));
    }
}

package racing;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCars = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int times = scanner.nextInt();

        Car[] cars = new Car[numberOfCars];


        IntStream.range(0, numberOfCars)
                 .forEach(i -> cars[i] = new Car(new RandomMoveStrategy()));

        ResultView view = new ResultView(new RacingGame(cars, times), '-');

        List<String> lines = view.drawLines();

        lines.forEach(System.out::println);
    }
}

package racing;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        String input = scanner.nextLine();
        String[] names = input.split(",");

        int numberOfCars = names.length;

        System.out.println("시도할 회수는 몇 회 인가요?");
        int times = scanner.nextInt();

        Car[] cars = new Car[numberOfCars];

        IntStream.range(0, numberOfCars)
                 .forEach(i -> cars[i] = new Car(new RandomMoveStrategy(), names[i]));

        ResultView view = new ResultView(new RacingGameImpl(cars, times));

        view.showResult();
    }
}

import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Main {
    private static final String REGEX = ",";
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names[] = scanner.nextLine().split(REGEX);
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = scanner.nextInt();

        List<Car> carList = new ArrayList<>();
        startRacing(carList, names, tryCount);
        resultRacing(carList);
    }

    private static void startRacing(List<Car> carList, String[] names, int tryCount) {
        IntStream.range(0, names.length).forEach(i -> carList.add(new Car(names[i])));
        IntStream.range(0, tryCount).forEach(i -> carList.stream().forEach(car -> car.randomMove(RANDOM.nextInt(10))));
    }

    private static void resultRacing(List<Car> carList) {
        int max = resultRacingUi(carList);
        String result = carList.stream().filter(car -> car.getMove() == max).map(Car::getName).collect(Collectors.joining(REGEX));
        System.out.println(resultFormatting(result));
    }

    private static int resultRacingUi(List<Car> carList) {
        System.out.println("실행 결과");
        int max = 0;
        for(Car car : carList) {
            System.out.println(racingFormatting(car));
            max = Math.max(max, car.getMove());
        }
        return max;
    }

    private static String racingFormatting(Car car) {
        return String.format("%s : %s", car.getName(), car.appendResultString());
    }

    private static String resultFormatting(String result) {
        return String.format("%s가 최종 우승했습니다.", result);
    }
}

package racingcar;

import racingcar.interfaces.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sangsik.kim
 */
public class ConsoleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        Integer numberOfCars = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        Integer numberOfExecutions = scanner.nextInt();

        RacingGame racingGame = new RacingGame(generateCars(numberOfCars));
        racingGame.start(numberOfExecutions);

        displayGameResult(racingGame.getGameRecord());
    }

    private static List<Car> generateCars(Integer numbersOfCar) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < numbersOfCar; i++) {
            cars.add(new BasicCar());
        }
        return cars;
    }

    private static void displayGameResult(GameRecord gameRecord) {
        System.out.println("### 실행결과 ###\n");
        Map<Integer, List<Integer>> records = gameRecord.loadAll();
        for (Integer round : records.keySet()) {
            printRecord(round, records);
        }
    }

    private static void printRecord(Integer round, Map<Integer, List<Integer>> records) {
        System.out.println(round + "회차");
        List<String> result = convertingRecordToHyphen(records.get(round));
        for (String position : result) {
            System.out.println(position);
        }
    }

    private static List<String> convertingRecordToHyphen(List<Integer> records) {
        List<String> result = new ArrayList<>();
        for (Integer record : records) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < record; i++) {
                str.append("-");
            }
            result.add(str.toString());
        }
        return result;
    }
}

package racinggame.view;

import java.util.Comparator;
import java.util.List;

public class DefaultResultView implements ResultView {

    private final static String OUTPUT_FORMAT = "-";
    private final static String BLANK_FORMAT = " : ";
    private final static String WINNER_FORMAT = "가 최종 우승했습니다.";
    private final static String BEFORE_FORMAT = "실행 결과";

    @Override
    public void beforeRacingGame() {
        nextLine();
        printMessage(BEFORE_FORMAT);
        nextLine();
    }

    @Override
    public void printResult(List<GameResult> cars) {
        for (GameResult gameResult : cars) {
            printMessage(gameResult.getName());
            printPositionByOne(gameResult.getPosition());
        }
        nextLine();
    }

    @Override
    public void afterRacingGame(List<GameResult> cars) {
        printWinnersNames(cars);
    }

    public void printWinnersNames(List<GameResult> cars) {
        printMessage(applyWinnersNames(cars).append(WINNER_FORMAT).toString());
    }

    private static StringBuilder applyWinnersNames(List<GameResult> cars) {
        StringBuilder sb = new StringBuilder();
        cars.stream()
                .filter(car -> car.getPosition() == getWinnersValue(cars))
                .forEach(car -> sb.append(car.getName()));
        return sb;
    }

    private static int getWinnersValue(List<GameResult> cars) {
        return cars.stream()
                .max(Comparator.comparing(GameResult::getPosition))
                .get()
                .getPosition();
    }

    private void printPositionByOne(Integer position) {
        printMessage(BLANK_FORMAT);
        for (int i=0; i<position; i++)
            System.out.print(OUTPUT_FORMAT);
        nextLine();
    }

    private static void printMessage(String message) {
        System.out.print(message);
    }

    private static void nextLine() {
        System.out.println();
    }
}

package racing;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.String.format;

public final class OutputView {

    private final static String JOIN_STRING = ", ";
    private final static String RECORD_SYMBOL = "-";
    private final static OutputView instance = new OutputView();

    private OutputView() {
    }

    public static OutputView getInstance() {
        return instance;
    }
    public void printResult(List<RacingCar> cars) {
        printRacingRecord(cars);
        printWinner(cars);
    }
    private void printRacingRecord(List<RacingCar> cars) {
        System.out.println("실행 결과");
        cars.forEach(car -> System.out.println(getCarRecord(car)));
    }

    private void printWinner(List<RacingCar> cars) {
        System.out.println(format("\n%s가 최종 우승했습니다.", getWinnerName(cars)));
    }

    public String getWinnerName(List<RacingCar> cars) {
        Predicate<RacingCar> winnerRecord = car -> car.getDistance() == getWinnerDistance(cars);
        return cars.stream().filter(winnerRecord)
                .map(RacingCar::getName)
                .collect(Collectors.joining(JOIN_STRING));
    }

    private int getWinnerDistance(List<RacingCar> cars) {
        return cars.stream().max(RacingCar::compareTo).get().getDistance();
    }

    public String getCarRecord(RacingCar car) {
        return nameForm(car.getName()) + distanceToRecord(car.getDistance());
    }

    private String nameForm(String name) {
        return format("%s : ", name);
    }

    public String distanceToRecord(int distance) {
        if (distance < 1) return "";
        if (distance == 1) return RECORD_SYMBOL;
        return RECORD_SYMBOL + distanceToRecord(--distance);
    }
}
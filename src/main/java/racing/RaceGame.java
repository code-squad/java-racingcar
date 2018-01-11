package racing;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RaceGame {

    private final static String JOIN_STRING = ", ";

    private RaceVO vo;

    public RaceGame() {

    }

    public void initRace() {
        initRace(new String[]{},0);
    }

    public void initRace(String[] names, int moveCount) {
        if (moveCount == 0) {
            InputView inputView = InputView.getByUser();
            names = inputView.getNames();
            moveCount = inputView.getMaxMoveCount();
        }
        vo = new RaceVO(names, moveCount);
    }

    public void printResult() {
        if (vo == null || vo.getCars() == null || vo.getCars().isEmpty()) throw new RuntimeException("initRace 메소드를 실행 후 진행하세요.");
        printRacingRecord();
        printWinner();
    }

    private void printRacingRecord() {
        System.out.println("실행 결과");
        vo.getCars().forEach(RacingCar::printCarDistance);
    }

    private void printWinner() {
        System.out.println(String.format("\n%s가 최종 우승했습니다.", getWinnerName(vo.getCars())));
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
}
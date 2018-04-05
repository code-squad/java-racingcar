package racingCar;

import java.util.*;

public class ResultView {
    private final String BLANK = "";
    private final String BAR = "-";
    private final String WINNING_MESSAGE = "가 최종 우승했습니다.";
    private List<Car> results;
    private int winningCondition;

    public ResultView(List<Car> results) {
        this.results = results;
    }

    public void result() {
        for (int tryCount = 0; tryCount < totalTryCount(); tryCount++) {
            showCurrentBar(tryCount);
            blank();
        }
        showWinner();
    }

    private int totalTryCount() {
        return results.get(0).getBarHistory().size();
    }

    private void showWinner() {
        List<String> winner = new ArrayList<>();
        for (Car car : results) {
            if (isWinningCondition(car)) winner.add(car.getName());
        }
        System.out.println(winner + WINNING_MESSAGE);
    }

    private boolean isWinningCondition(Car car) {
        return car.getBar() == winningCondition;
    }

    private void showCurrentBar(int tryCount) {
        for (int carCount = 0; carCount < totalCarCount(); carCount++) {
            makeBar(getCarName(carCount), getCarRecord(tryCount, carCount));
        }
    }

    private int totalCarCount() {
        return results.size();
    }

    private Integer getCarRecord(int tryCount, int carCount) {
        return results.get(carCount).getBarHistory().get(tryCount);
    }

    private String getCarName(int carCount) {
        return results.get(carCount).getName();
    }

    private void blank() {
        System.out.println();
    }

    private void makeBar(String carName, int record)throws NullPointerException {
        String status = BLANK;
        for (int startPostion = 1; startPostion <= record; startPostion++) {
            status += BAR;
            checkWinningCondition(record);
        }
        System.out.println(carName + "  : " + status);
    }

    private void checkWinningCondition(int record) {
        if (record > winningCondition) winningCondition = record;
    }
}

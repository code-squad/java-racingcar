package racingCar;

import java.util.*;

public class ResultView {
    private final String BLANK = "";
    private final String BAR = "-";
    private final String WINNING_MESSAGE = "가 최종 우승했습니다.";
    private List<Car> results;

    public ResultView(List<Car> results) {
        this.results = results;
    }

    public void result(List<String> winner) {
        for (int tryCount = 0; tryCount < totalTryCount(); tryCount++) {
            showCurrentBar(tryCount);
            blank();
        }
        winnerPrint(winner);
    }

    private void winnerPrint(List<String> winner) {
        System.out.println(winner + WINNING_MESSAGE);
    }

    private int totalTryCount() {
        return results.get(0).getBarHistory().size();
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

    private void makeBar(String carName, int record) throws NullPointerException {
        String status = BLANK;
        for (int startPostion = 1; startPostion <= record; startPostion++) {
            status += BAR;
        }
        System.out.println(carName + "  : " + status);
    }
}

package car.race;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Result {
    private String winnerNames;
    private int maxPosition;

    private void buildResult(Car e) {
        Output.printMessage(e.getName() + ": ");
        Output.printDash(e.getPosition());
        Output.startNewLine();
    }

    public void showResult(List<Car> cars) {
        for (Car e : cars) {
            buildResult(e);
        }
    }

    public void findMaxPosition(List<Car> cars) {
        List<Integer> carPositions = new ArrayList<>();
        for (Car e : cars) {
            carPositions.add(e.getPosition());
        }
        this.maxPosition = Collections.max(carPositions);
    }

    public List<String> createWinnersList(List<Car> cars) {
        List<String> winners = new ArrayList<>();
        for (Car e : cars) {
            if (e.getPosition() == this.maxPosition) {
                winners.add(e.getName());
            }
        }
        return winners;
    }

    public void findWinner(List<Car> cars) {
        StringJoiner joiner = new StringJoiner(",");

        findMaxPosition(cars);

        for (String name : createWinnersList(cars)) {
            joiner.add(name);
        }
        this.winnerNames = joiner.toString();
    }

    public void printWinner() {
        Output.printMessage("The winner is.. " + this.winnerNames + "!");
    }

    public int getMaxPosition() {
        return this.maxPosition;
    }

    public String getWinnerNames() {
        return this.winnerNames;
    }
}

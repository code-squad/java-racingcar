package car.race;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Result {
    private int maxPosition;
    private String winnerNames;

    private void buildResult(Car e) {
        Output.printMessage(e.getName() + ": ");
        Output.printDash(e.getPosition());
        Output.startNewLine();
    }

    public void displayResult(List<Car> cars) {
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

    public int getMaxPosition() {
        return this.maxPosition;
    }

    private List<String> createWinnersList(List<Car> cars) {
        List<String> winners = new ArrayList<>();
        for (Car e : cars) {
            if (e.getPosition() == this.maxPosition) {
                winners.add(e.getName());
            }
        }
        return winners;
    }

    private static String convertListToString(List<String> winners) {
        StringJoiner joiner = new StringJoiner(",");

        for (String name : winners) {
            joiner.add(name);
        }
        return joiner.toString();
    }

    private static void printWinner(String winnerNames) {
        Output.printMessage("The winner is.. " + winnerNames + "!");
    }

    public void findWinner(List<Car> cars){
        findMaxPosition(cars);
        List<String> winners = createWinnersList(cars);
        String winnerNames = convertListToString(winners);
        printWinner(winnerNames);
        this.winnerNames = winnerNames;
    }

    public String getWinnerNames(){
        return this.winnerNames;
    }
}
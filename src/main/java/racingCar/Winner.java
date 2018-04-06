package racingCar;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<Car> results;
    private List<String> winner;
    private int winningCondition;


    public Winner(List<Car> results) {
        this.results = results;
    }

    public void winnerCheck() {
        winner = new ArrayList<>();
        checkWinningCondition();
        for (Car car : results) {
           if (winningCondition == car.getBar()) winner.add(car.getName());
        }
    }

    private void checkWinningCondition() {
         for (Car car : results) {
            if (car.getBar() > winningCondition){
                winningCondition = car.getBar();
            }
        }
    }

    public List<String> getWinner() {
        return winner;
    }
}

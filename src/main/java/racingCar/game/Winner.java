package racingCar.game;
import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<Car> results;

    public Winner(List<Car> results) {
        this.results = results;
    }

    public List<String> winnerCheck() {
        int winningCondition = checkWinningCondition();
        List<String> winner = new ArrayList<>();
        for (Car car : results) {
            if(car.matchCondition(winningCondition)) {
                winner.add(car.getName());
            }
        }
        return winner;
    }

    private int checkWinningCondition() {
        int maxPostion = 0;
        for (Car car : results) {
            if (car.checkWiningCondition(maxPostion)) {
                 maxPostion = car.getBar();
            }
        }
        return maxPostion;
    }
}

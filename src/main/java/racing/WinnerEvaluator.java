package racing;

import racing.model.Car;

import java.util.List;

public interface WinnerEvaluator {
    List<Car> voteWinner(List<Car> cars);
}

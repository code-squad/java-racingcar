package racing;

import racing.model.Car;

import java.util.ArrayList;
import java.util.List;

public class SimpleWinnerEvaluator implements WinnerEvaluator {
    @Override
    public List<Car> voteWinner(List<Car> cars) {
        int maxPosition = calcMaxPosition(cars);

        return getWinnerCars(maxPosition, cars);
    }

    private List<Car> getWinnerCars(int maxPosition, List<Car> cars) {
        List<Car> winnerCars = new ArrayList<>();
        for (Car car : cars) {
            if (maxPosition == car.getPosition()) {
                winnerCars.add(car);
            }
        }
        return winnerCars;
    }

    private int calcMaxPosition(List<Car> cars) {
        int max = 0;
        for (Car car : cars) {
            if (car.getPosition() > max) {
                max = car.getPosition();
            }
        }
        return max;
    }
}

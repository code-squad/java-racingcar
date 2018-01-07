package racing;

import racing.model.Car;

import java.util.ArrayList;
import java.util.List;

public class SimpleWinnerEvaluator implements WinnerEvaluator {
    @Override
    public List<Car> voteWinner(List<Car> cars) {
        List<Car> winnerCars = new ArrayList<>();

        for (Car car : cars) {
            voteWinner(winnerCars, car);
        }

        return winnerCars;
    }

    private void voteWinner(List<Car> winnerCars, Car car) {
        if (winnerCars.isEmpty()) {
            winnerCars.add(car);
            return;
        }

        Car oneOfWinnerCar = winnerCars.get(0);

        if (oneOfWinnerCar.getPosition() > car.getPosition()) {
            return;
        }

        if (oneOfWinnerCar.getPosition() < car.getPosition()) {
            winnerCars.clear();
        }
        
        winnerCars.add(car);
    }
}

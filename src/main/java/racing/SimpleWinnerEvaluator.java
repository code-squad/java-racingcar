package racing;

import racing.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleWinnerEvaluator implements WinnerEvaluator {
    @Override
    public List<Car> voteWinner(List<Car> cars) {
        int maxPosition = calcMaxPosition(cars);

        return getWinnerCars(maxPosition, cars);
    }

    private List<Car> getWinnerCars(int maxPosition, List<Car> cars) {
        // jdk 7
//        List<Car> winnerCars = new ArrayList<>();
//        for (Car car : cars) {
//            if (maxPosition == car.getPosition()) {
//                winnerCars.add(car);
//            }
//        }
        return cars.stream()
                .filter(car -> car.matchPosition(maxPosition))
                .collect(Collectors.toList());

    }

    private int calcMaxPosition(List<Car> cars) {
        // jdk 7
//        int max = 0;
//        for (Car car : cars) {
//            if (car.getPosition() > max) {
//                max = car.getPosition();
//            }
//        }

        return cars.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .orElseThrow(() -> new IllegalStateException("max is not exist."))
                .getPosition();
    }
}

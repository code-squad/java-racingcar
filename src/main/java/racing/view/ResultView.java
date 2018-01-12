package racing.view;

import racing.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public List<String> showGameResult(List<Car> cars) {
        List<String> results = new ArrayList<>();
        cars.forEach(car -> results.add(showGameResult(car, car.getPosition())));
        return results;
    }

    private String showGameResult(Car car, int move) {
        StringBuilder sb = new StringBuilder();
        sb.append(car.getName())
            .append(" : ");
        for (int i=0; i<move; i++) {
            sb.append("&nbsp");
        }
        return sb.toString();
    }

    public String showGameWinner(List<Car> cars) {
        return cars
                .stream()
                .map(Car::getName)
                .collect(Collectors.joining(", ")) +
                "가 최종 우승했습니다.";
    }
}

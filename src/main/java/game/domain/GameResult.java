package game.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameResult {

    private List<List<Car>> records;

    public GameResult() {
        records = new ArrayList<>();
    }

    public GameResult(List<List<Car>> records) {
        this.records = records;
    }

    public void record(List<Car> cars) {
        records.add(cars);
    }

    public String draw() {
        StringBuilder result = new StringBuilder();
        records.forEach(cars -> {
            result.append(draw(cars));
            result.append("\n");
        });
        return result.toString();
    }

    public String draw(List<Car> cars) {
        StringBuilder result = new StringBuilder();
        cars.forEach(car -> {
            result.append(car.getName() + " : ");
            IntStream.rangeClosed(0, car.getPosition())
                    .forEach(i -> result.append("-"));

            result.append("\n");
        });
        return result.toString();
    }

    public List<Car> winner() {
        return last().stream()
                .filter(car -> Objects.equals(car.getPosition(), top()))
                .collect(Collectors.toList());
    }

    public List<Car> last() {
        return new ArrayList<>(records.get(records.size() - 1));
    }

    private Integer top() {
        return last().stream()
                .max(Comparator.comparing(Car::getPosition))
                .get()
                .getPosition();
    }
}

package game;

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
        if(records == null) {
            throw new IllegalArgumentException();
        }

        StringBuilder result = new StringBuilder();
        records.forEach(cars -> {
            cars.forEach(car -> {
                result.append(car.getName() + " : ");
                IntStream.rangeClosed(0, car.getPosition())
                        .forEach(i -> result.append("-"));

                result.append("\n");
            });
            result.append("\n");
        });
        return result.toString();
    }

    public List<Car> winner() {
        List<Car> last = new ArrayList<>(records.get(records.size() - 1));
        Integer top = last.stream()
                        .max(Comparator.comparing(Car::getPosition))
                        .get()
                        .getPosition();

        return last.stream()
                .filter(car -> Objects.equals(car.getPosition(), top))
                .collect(Collectors.toList());
    }
}

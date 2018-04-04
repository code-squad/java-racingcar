package game;

import java.util.List;

public class GameResult {

    private List<List<Car>> histories;

    public GameResult(List<List<Car>> histories) {
        this.histories = histories;
    }

    public String draw() {
        if(histories == null) {
            throw new IllegalArgumentException();
        }

        StringBuilder result = new StringBuilder();
        histories.forEach(cars -> {
            cars.forEach(car -> {
                for (int i = 0; i <= car.getPosition(); i++) {
                    result.append("-");
                }
                result.append("\n");
            });
            result.append("\n");
        });
        return result.toString();
    }
}

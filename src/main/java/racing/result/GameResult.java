package racing.result;

import racing.player.Car;

import java.util.*;

public class GameResult {
    private int bestScore = 0;
    protected Map<Integer, List<Car>> score;

    public GameResult() {
        score = new HashMap<>();
    }

    public void ranking(Car car) {
        resetBestScore(car);

        updateScore(car);
    }

    private void updateScore(Car car) {
        List<Car> cars = initCars(car);
        cars.add(car);
        score.put(car.position, cars);
    }

    private List<Car> initCars(Car car) {
        List<Car> cars = score.get(car.position);
        if(cars == null) {
            cars = new ArrayList<>();
        }
        return cars;
    }

    private void resetBestScore(Car car) {
        bestScore = bestScore > car.position ? bestScore : car.position;
    }

    public List<Car> getWinner() {
        return score.get(bestScore);
    }

    public String getWinnerName() {
        List<Car> cars = getWinner();

        String[] names = new String[cars.size()];
        for(int i = 0; i < names.length; i++) {
            names[i] = cars.get(i).name;
        }

        return String.join(", ", names );
    }
}

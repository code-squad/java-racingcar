package racing.result;

import racing.player.Car;

import java.util.List;

public class MoveResult {
    public String[] distances;

    public void setMoveResult(List<Car> cars) {
        distances = new String[cars.size()];
        for(int i = 0; i < distances.length; i++) {
            distances[i] = getCarDistance(cars.get(i));
        }
    }

    private String getCarDistance(Car car) {
        return car.name + "\t: " + car.distance;
    }
}

package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private List<Car> cars;

    public RacingGame(String[] carNames) {
        cars = createCars(carNames);

    }

    private List<Car> createCars(String[] carNames) {
        cars = new ArrayList<Car>();
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    List<Car> move() {
        for(int i = 0; i < cars.size(); i++) {
            cars.get(i).addPosition();
        }

        return cars;
    }

    int getTopPosition() {
        int topPosition = 0;
        for(int i = 0; i < cars.size(); i++) {
            topPosition = comparetPosition(topPosition, cars.get(i).getPosition());
        }

        return topPosition;
    }

    int comparetPosition(int topPosition, int position) {
        if(position >= topPosition) {
            topPosition = position;
        }

        return topPosition;
    }

    List<String> getWinnnersRacing() {
        List<String> winners = new ArrayList<String>();

        int topPosition = getTopPosition();
        for(int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            addWinners(winners, topPosition, car);
        }

        return winners;
    }

    private void addWinners(List<String> winners, int topPosition, Car car) {
        if(topPosition == car.getPosition()) {
            winners.add(car.getCarName());
        }
    }



}

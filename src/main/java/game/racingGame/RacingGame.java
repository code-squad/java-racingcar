package game.racingGame;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Getter
public class RacingGame {

    private List<Car> cars;
    private Integer trialTime;
    private Random random;

    public RacingGame(String[] nameOfCars, Integer trialTime) {
        this.random = new Random();
        this.cars = new ArrayList();

        for (int i = 0; i < nameOfCars.length; i++) {
            this.cars.add(new Car(nameOfCars[i]));
        }

        this.trialTime = trialTime;
    }

    public void move() {
        for (Car car : cars) {
            for (int i = 0; i < trialTime; i++) {
                car.move(getRandom());
            }
        }
    }

    public List<Car> pickWinners() {
        List<Car> winners = new ArrayList();

        List<Car> sortedCars  = cars.stream().sorted(Comparator.comparing(Car::getPosition).reversed()).collect(Collectors.toList());

        for (int i = 0 ; i < sortedCars.size() - 1 ; i++){
            if(sortedCars.get(i).getPosition() != sortedCars.get(i+1).getPosition()){
                winners.add(sortedCars.get(i));
                return winners;
            }
            winners.add(sortedCars.get(i));
        }
        return winners;
    }

    private Integer getRandom() {
        return random.nextInt(10);
    }
}

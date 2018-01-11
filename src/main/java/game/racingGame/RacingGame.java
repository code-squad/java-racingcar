package game.racingGame;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Getter
public class RacingGame {

    private List<Car> cars;
    private Integer trialTime;
    private Random random;
    private List<Car> winners;

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
        List<Car> sortedCars  = cars.stream().sorted(Comparator.comparing(Car::getPosition).reversed()).collect(Collectors.toList());

        return findCoWinner(sortedCars);
    }

    private List<Car> findCoWinner(List<Car> sortedCars) {
        winners = new ArrayList();
        Integer maxPosition = sortedCars.get(0).getPosition();

        for(Car car : sortedCars) {
            if(car.getPosition().equals(maxPosition)){
                winners.add(car);
            }
        }

        return winners;
    }

    private Integer getRandom() {
        return random.nextInt(10);
    }

    public Map<String, Integer> getResult(){
        Map<String, Integer> result = new LinkedHashMap();

        for (Car car: cars){
            result.put(car.getName(), car.getPosition());
        }

        return result;
    }

    public List<String> getWinnersName(){
        List<String> winnersName = new ArrayList();

        for (Car car: winners){
            winnersName.add(car.getName());
        }
        return winnersName;
    }
}

package car.race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRace {
    private int moves;
    private List<Car> cars;

    CarRace(String playerNames, int numMoves) {
        this.moves = numMoves;

        String[] names = playerNames.split(",");
        cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    private void runCar(Car car, int tryNum) {
        for (int i = 0; i < tryNum; i++) {
            car.runOnce(generateRandNum());
        }
    }

    public void startRace() {
        for (Car e : cars) {
            runCar(e, moves);
        }
    }

    private static int generateRandNum() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
package race;

import java.util.List;
import java.util.Random;

class RacingGame {
    private List<Car> cars;
    private int iteration;
    private MoveRule rule;
    private Drawer drawer;
    
    private Random random;

    RacingGame(List<Car> cars, int iteration, MoveRule rule, Drawer drawer) {
        setCars(cars);
        this.iteration = iteration;
        this.rule = rule;
        this.drawer = drawer;
        
        random = new Random();
    }

    void race() {
        for (int i = 0; i < iteration; i++) {
            cars.forEach(this::move);
            drawer.draw(cars);
        }
    }

    List<Car> getResult() {
        return cars;
    }

    private int getIntEqualsOrUnderOf(int limit) {
        return random.nextInt(limit);
    }

    private void move(Car car) {
        if (rule.canMove(getIntEqualsOrUnderOf(9))) {
            car.move();
        }
    }

    private void setCars(List<Car> cars) {
        if (cars == null || cars.size() == 0) {
            throw new IllegalArgumentException();
        }
        
        this.cars = cars;
    }
}


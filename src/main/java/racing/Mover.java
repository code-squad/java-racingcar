package racing;

import racing.model.Car;
import racing.model.GameConfiguration;

import java.util.List;

public class Mover {
    private DeciderToGo deciderToGo;

    public Mover(DeciderToGo deciderToGo) {
        this.deciderToGo = deciderToGo;
    }

    public void generatePositions(GameConfiguration gameConfiguration) {
        List<Car> cars = gameConfiguration.getCars();
        int tryCount = gameConfiguration.getTryCount();

        for (Car car : cars) {
            calculatePosition(tryCount, car);
        }
    }

    private void calculatePosition(int tryCount, Car car) {
        for (int i=0; i<tryCount; i++) {
            car.move(deciderToGo.isPossibleToGo());
        }
    }
}

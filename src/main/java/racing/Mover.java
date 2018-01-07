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
            car.setPosition(calculatePosition(tryCount));
        }
    }

    private Integer calculatePosition(int tryCount) {
        int position = 0;
        for (int i=0; i<tryCount; i++) {
            position = move(position);
        }
        return position;
    }

    public int move(int position) {
        return move(deciderToGo.isPossibleToGo(), position);
    }

    private int move(boolean go, int position) {
        return go ? (position+1) : position;
    }
}

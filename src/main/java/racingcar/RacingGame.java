package racingcar;

import racingcar.interfaces.Car;
import racingcar.interfaces.MoveScoreMaker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sangsik.kim
 */
public class RacingGame {
    private List<Car> cars;
    private GameRecord gameRecord;

    public RacingGame(List<Car> cars) {
        this.cars = cars;
        this.gameRecord = new GameRecord();
    }

    public void start(Integer numberOfExecutions) {
        initialize();
        execution(numberOfExecutions);
    }

    public GameRecord getGameRecord() {
        return this.gameRecord;
    }

    private void execution(Integer numberOfExecutions) {
        Time time = new Time(numberOfExecutions);
        while (time.hasLeft()) {
            time.spend();
            moveCars(new RandomMoveScoreMaker());
            saveRecord(time.count());
        }
    }

    private void saveRecord(Integer round) {
        List<Integer> records = new ArrayList<>();
        for (Car car : this.cars) {
            records.add(car.getCurrentPosition());
        }
        this.gameRecord.save(round, records);
    }

    private void initialize() {
        this.gameRecord.initialize();

        for (Car car : cars) {
            car.initialize();
        }
    }

    private void moveCars(MoveScoreMaker moveScoreMaker) {
        for (Car car : this.cars) {
            car.move(moveScoreMaker);
        }
    }
}

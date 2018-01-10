package racinggame.domain;

import racinggame.dto.RacingResult;
import racinggame.utils.RandomValueGenerator;
import racinggame.utils.StringUtils;

import java.util.*;

public class RacingGame {
    private static final int MAX_BOUND = 10;

    private List<Car> cars = new ArrayList<>();

    public RacingGame(String inputNames) {
        if (StringUtils.isBlank(inputNames)) {
            throw new IllegalArgumentException("사용자 이름은 빈 값이 될 수 없습니다.");
        }
        this.cars = createCars(inputNames);
    }

    private static List<Car> createCars(String inputNames) {
        List<Car> cars = new ArrayList<>();
        String[] names = inputNames.split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public RacingResult racing(int tryNo) {
        for (int i = 0; i < tryNo; i++) {
            racingPerTry();
        }
        return getResult();
    }

    private void racingPerTry() {
        for (Car car: cars) {
            car.move(RandomValueGenerator.nextInt(MAX_BOUND));
        }
    }

    private RacingResult getResult() {
        RacingResult result = new RacingResult();
        for (Car car : cars) {
            result.add(car.toCarDto());
        }
        return result;
    }
}

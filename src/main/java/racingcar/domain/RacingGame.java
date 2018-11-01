package racingcar.domain;

import org.apache.commons.lang3.StringUtils;
import racingcar.dto.RacingGameDto;
import racingcar.utils.RandomValueGenerator;
import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    public static final String COMMA_SEPARATOR = ",";
    private List<Car> cars = new ArrayList<>();

    private RacingGame(String carName) throws NullPointerException {
        if (StringUtils.isBlank(carName)) throw new NullPointerException("자동차 이름은 빈칸이 될 수 없습니다.");

        String[] carNames = carName.split(COMMA_SEPARATOR);
        for (String car : carNames) cars.add(Car.ofName(car));
    }

    public static RacingGame ofcarName(String carName) {
        return new RacingGame(carName);
    }

    public RacingGameDto race(int count) throws IllegalArgumentException {
        if (count < 1) throw new IllegalArgumentException("최소 1회는 실시해야 합니다.");

        for (int i = 0; i < count; i++) moveCar();
        return racingGameDto();
    }

    private void moveCar() {
        for (Car car : cars) car.movePosition(RandomValueGenerator.generateRandomNum());
    }

    private RacingGameDto racingGameDto() {
        RacingGameDto result = RacingGameDto.of();
        for (Car car : cars) result.setCars(car.CarDto());
        return result;
    }
}

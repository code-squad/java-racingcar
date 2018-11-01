package racingcar.dto;

import racingcar.domain.RacingGame;
import java.util.ArrayList;
import java.util.List;

public class RacingGameDto {
    private List<CarDto> cars = new ArrayList<>();

    private RacingGameDto() {}

    public static RacingGameDto of() {
        return new RacingGameDto();
    }

    public void setCars(CarDto carDto) {
        cars.add(carDto);
    }

    public List<CarDto> getCars() {
        return cars;
    }

    static int setMaxPosition(List<CarDto> cars) {
        int maxPosition = 0;
        for (CarDto car : cars) if(car.getPosition() > maxPosition) maxPosition = car.getPosition();
        return maxPosition;
    }

    static List<CarDto> getWinners(int maxPosition, List<CarDto> cars) {
        List<CarDto> winners = new ArrayList<>();
        for (CarDto car : cars) if (car.getPosition() == maxPosition) winners.add(car);
        return winners;
    }

    public static String getWinnerNames(List<CarDto> cars) {
        List<String> winnerNames = new ArrayList<>();
        for (CarDto winner : getWinners(setMaxPosition(cars), cars)) winnerNames.add(winner.getName());
        return String.join(RacingGame.COMMA_SEPARATOR, winnerNames);
    }
}

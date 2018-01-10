package racinggame.dto;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {
    private static final String COMMA_SEPARATOR = ",";

    private List<CarDto> cars = new ArrayList<>();

    public void add(CarDto carDto) {
        cars.add(carDto);
    }

    public List<CarDto> getCars() {
        return cars;
    }

    public String createWinnerNames() {
        return joinComma(getWinnerNames(getWinners(cars, maxPosition(cars))));
    }

    public static int maxPosition(List<CarDto> carDtos) {
        int maxPosition = 0;
        for (CarDto carDto: carDtos) {
            if (maxPosition < carDto.getPosition()) {
                maxPosition = carDto.getPosition();
            }
        }
        return maxPosition;
    }

    public static List<CarDto> getWinners(List<CarDto> carDtos, int maxPosition) {
        List<CarDto> winners = new ArrayList<>();
        for (CarDto carDto: carDtos) {
            if (carDto.isMaxPosition(maxPosition)) {
                winners.add(carDto);
            }
        }
        return winners;
    }

    public static List<String> getWinnerNames(List<CarDto> winners) {
        List<String> winnerNames = new ArrayList<>();
        for (CarDto carDto: winners) {
            winnerNames.add(carDto.getName());
        }
        return winnerNames;
    }

    public static String joinComma(List<String> winnerNames) {
        return String.join(COMMA_SEPARATOR, winnerNames);
    }
}

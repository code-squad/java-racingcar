package racingcar.view;

import racingcar.dto.CarDto;
import racingcar.dto.RacingGameDto;
import java.util.List;

public class ResultView {
    private static final String POSITION_BAR = "-";
    private static final String NAME_COLON = " : ";

    private ResultView() {
    }

    public static void printResult(RacingGameDto result) {
        List<CarDto> cars = result.getCars();

        System.out.println("실행결과");
        for (CarDto car : cars) {
            printEachCarResult(car);
            System.out.println();
        }
        System.out.println(result.getWinnerNames(cars) + "가 최종 우승했습니다.");
    }

    private static void printEachCarResult(CarDto car) {
        System.out.print(car.getName() + NAME_COLON);
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(POSITION_BAR);
        }
    }
}

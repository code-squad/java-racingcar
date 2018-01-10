package racing.game;

import racing.car.Car;
import racing.car.CarList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class ResultView {

    private final CarList carList;

    public ResultView(CarList carList) {
        this.carList = carList;
    }

    public void printResult() {
        carList.forEach(car -> {
            printCarNameAndPosition(car);
            System.out.println();
        });

        System.out.println();
        List<Car> winners = carList.getWinners();
        printWinners(winners);

    }

    private void printCarNameAndPosition(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
    }

    private void printWinners(List<Car> winners) {
        String message = "가 최종 우승했습니다";
        String winnerNames = String.join(", ", winners.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList()));
        System.out.println(winnerNames + message);
    }

}

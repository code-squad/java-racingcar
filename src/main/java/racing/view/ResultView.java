package racing.view;

import racing.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public void showGameResult(List<Car> cars) {
        System.out.println("\n실행 결과");
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            showGameResult(car.getPosition());
        }
        System.out.println("");
    }

    private void showGameResult(int move) {
        for (int i=0; i<move; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public void showGameWinner(List<Car> cars) {
        System.out.print(cars
                        .stream()
                        .map(Car::getName)
                        .collect(Collectors.joining(", ")));
        System.out.println("가 최종 우승했습니다.");
    }
}

package game.view;

import game.domain.GameResult;
import game.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView implements View {

    public static void print(GameResult gameResult) {
        System.out.println("\n실행 결과");
        System.out.println(gameResult.draw());

        String winners = join(gameResult.winner());
        System.out.println(winners + "이(가) 최종 우승했습니다.");
    }

    public static String join(List<Car> cars) {
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
    }

    public static String html(GameResult gameResult) {
        return gameResult.draw(gameResult.last());
    }
}

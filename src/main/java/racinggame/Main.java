package racinggame;

import racinggame.domain.Car;
import racinggame.domain.RacingGame;
import racinggame.view.DefaultRacingGameView;
import racinggame.view.RacingGameView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> carNames = initCarNames(sc);
        int tryCount = initRacingGameTryCount(sc);

        RacingGame racingGame = initRacingGame(carNames);

        beforeRacingGame();
        doRacingGame(racingGame, tryCount);
        afterRacingGame(racingGame);
    }

    private static List<String> initCarNames(Scanner sc) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return Arrays.asList(sc.nextLine().split(","));
    }

    private static int initRacingGameTryCount(Scanner sc) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return sc.nextInt();
    }

    private static RacingGame initRacingGame(List<String> carNames) {
        List<Car> carList = new ArrayList<>();
        RacingGameView racingGameView = new DefaultRacingGameView();

        for (String carName : carNames)
            carList.add(new Car(carName));

        return new RacingGame(carList, racingGameView);
    }

    private static void beforeRacingGame() {
        System.out.println();
        System.out.println("실행 결과");
    }

    private static void doRacingGame(RacingGame racingGame, int tryCount) {
        for (int i=0; i<tryCount; i++)
            racingGame.start();
    }

    private static void afterRacingGame(RacingGame racingGame) {
        String winnerNames = racingGame.getWinnerNames().stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }
}
package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int carCount = sc.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = sc.nextInt();

        List<Car> carList = new ArrayList<>();
        RacingGameView racingGameView = new DefaultRacingGameView();

        for (int i = 0; i<carCount; i++)
            carList.add(new Car());

        RacingGame racingGame = new RacingGame(carList, racingGameView);

        for (int i=0; i<tryCount; i++) {
            racingGame.start();
            racingGame.printRacingResult();
        }
    }
}

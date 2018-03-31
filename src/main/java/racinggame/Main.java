package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int carCount;
    private static int tryCount;

    public static void main(String[] args) {
        init();

        List<Car> carList = new ArrayList<>();

        for (int i=0; i<carCount; i++)
            carList.add(new Car());

        RacingGame racingGame = new RacingGame(carList);

        for (int i=0; i<tryCount; i++) {
            racingGame.start();
            racingGame.printAll();
        }
    }

    private static void init() {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        carCount = sc.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        tryCount = sc.nextInt();
    }
}

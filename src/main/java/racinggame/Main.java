package racinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        List<String> carNames = Arrays.asList(sc.nextLine().split(","));

        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = sc.nextInt();

        List<Car> carList = new ArrayList<>();
        RacingGameView racingGameView = new DefaultRacingGameView();

        for (String carName : carNames)
            carList.add(new Car(carName));

        RacingGame racingGame = new RacingGame(carList, racingGameView);

        for (int i=0; i<tryCount; i++) {
            racingGame.start();
            racingGame.printRacingResult();
        }
    }
}

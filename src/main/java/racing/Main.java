package racing;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int countOfCar = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = scanner.nextInt();

        RacingGame racingGame = new RacingGame(countOfCar, tryCount);

        //경주 시작
        racingGame.racing(tryCount);

        //결과 출력
        System.out.println("실행 결과");
        racingGame.printCarsDistance();

        return;
    }
}

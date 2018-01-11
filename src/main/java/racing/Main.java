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
        System.out.println("경주할 자동차 이름을 입력하세요");
        String carNames = scanner.nextLine();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int tryCount = scanner.nextInt();

        RacingGame racingGame = new RacingGame(carNames);

        //경주 시작
        racingGame.racing(tryCount);

        //결과 출력
        System.out.println("실행 결과");
        racingGame.printCarsDistance();
        racingGame.printWinner();



        return;
    }
}

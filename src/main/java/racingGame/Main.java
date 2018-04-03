package racingGame;

import java.util.Scanner;

/**
 * Created by hongjong-wan on 2018. 4. 3..
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int carNum = InputView.getCarNum(sc);
        int tryNum = InputView.getTryNum(sc);

        RacingGame racingGame = new RacingGame(carNum);
        racingGame.moveCars(tryNum);

    }
}

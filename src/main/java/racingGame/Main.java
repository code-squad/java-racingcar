package racingGame;

import java.util.List;
import java.util.Scanner;

/**
 * Created by hongjong-wan on 2018. 4. 3..
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String carNames = InputView.getCarNames(sc);
        int tryNum = InputView.getTryNum(sc);


        RacingGame racingGame = new RacingGame(carNames);

        for (int i = 0; i < tryNum; i++) {
            ResultView.printTrace(racingGame.moveCars());
        }

        ResultView.printWinner(racingGame.findWinners());
    }
}

package racingGame;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String carNames = InputView.getCarNames();
        int tryNo = InputView.getTryNo();

        Game game = new Game(carNames);
        GameResult result = null;
        for(int i = 0; i < tryNo; i++) {
            result = game.move();
            ResultView.print(result);
        }
        ResultView.printWinner(result);
    }

}

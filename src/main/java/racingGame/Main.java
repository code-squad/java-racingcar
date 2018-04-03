package racingGame;

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

        // tryNum값을 구현한것 처럼 moveCars()메소드에 인자로 넣지말고,
        // for문으로 racingGame.moveCars()메소드를 감싸서 tryNum 만큼 호출하는 구조는 별로인가요?
        /*
            for(int i = 0; i < tryNum; i++){
                List<Car> car = racingGame.moveCars()
                ResultView.printTrace(cars);
            }
        */
        racingGame.moveCars(tryNum);
        ResultView.printWinner(racingGame.findWinnerCars());
    }
}

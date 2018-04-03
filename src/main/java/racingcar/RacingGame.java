package racingcar;

import java.util.Random;

public class RacingGame {

    private static Random random = new Random();
    private int[] carPosition;

    public RacingGame(int carNo) {
        this.carPosition = new int[carNo];
    }

    public GameResult choiceMovingCar() {
        for(int j = 0; j < this.carPosition.length; j++) {
          if(isGetMoreThanFiveNum()) {
            moveCar(j);
          }
        }
        return new GameResult(this.carPosition);
    }

    public boolean isGetMoreThanFiveNum() {
        return random.nextInt(10) > 4;
    }

    public void moveCar(int moveNum) {
        this.carPosition[moveNum] += 1;
    }

    //단위테스트를 위한 임시 Method
    public int[] getCarPosition() {
        return carPosition;
    }

    public static void main(String[] args) {

        int carNo = InputView.getCarNo();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNo);

        for(int i = 0; i < tryNo; i++) {
            GameResult result = racingGame.choiceMovingCar();
            ResultView.printCarRoutes(result);
        }
    }
}

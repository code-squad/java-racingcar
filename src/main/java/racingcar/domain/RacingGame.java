package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.*;

public class RacingGame {

    private static Random random = new Random();
    public List<Car> carList;
    public static final int RULENUM = 4;

    public RacingGame(List<Car> carList) {
        this.carList = carList;
    }

    public GameResult choiceMovingCar() {
        for(int j = 0; j < carList.size(); j++) {
            if(isGetMoreThanFiveNum()) {
                moveCar(j);
            }
        }
        return new GameResult(this.carList);
    }

    public boolean isGetMoreThanFiveNum() {
        return random.nextInt(10) > RULENUM;
    }

    public void moveCar(int moveNum) {
        carList.get(moveNum).addCarPostion();
    }

    public GameResult choiceWinner(GameResult result) {

        Collections.sort(carList);
        int maxCarPosition = carList.get(0).getCarPostion();

        for(Car car:carList) {
            addMaxCarPostion(result, maxCarPosition, car);
        }

        return result;
    }

    private void addMaxCarPostion(GameResult result, int maxCarPosition, Car car) {
        if(maxCarPosition == car.getCarPostion()) {
            result.addWinner(car);
        }
    }

    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame(InputView.getCarList());
        int tryNo = InputView.getTryNo();
        GameResult result = null;

        for(int i = 0; i < tryNo; i++) {
            result = racingGame.choiceMovingCar();
            ResultView.printCarRoutes(result);
        }

        ResultView.printWinnerCarRacing(racingGame.choiceWinner(result));
    }
}

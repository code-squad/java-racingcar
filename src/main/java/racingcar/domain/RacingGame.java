package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.*;

public class RacingGame {

    private static Random random = new Random();
    private List<Car> carList;
    private static final int RULENUM = 4;

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
        carList.get(moveNum).addCarPostion();//디미터에 어긋나긴 하는데 이렇게 List라서 이렇게 썼습니다.
    }

    public GameResult getWinner(GameResult result) {

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

    //단위테스트를 위한 임시 Method
    public List<Car> getCarPosition() {
        return carList;
    }

    //단위테스트를 위한 임시 Method
    public static int getRuleNum() {
        return RULENUM;
    }

    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame(InputView.getCarList());
        int tryNo = InputView.getTryNo();
        GameResult result = null;

        for(int i = 0; i < tryNo; i++) {
            result = racingGame.choiceMovingCar();
            ResultView.printCarRoutes(result);
        }

        ResultView.printWinnerCarRacing(racingGame.getWinner(result));
    }
}

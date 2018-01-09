package racingGame;

import java.util.List;

public class ResultView {

    public void printResult(RacingGame racingGame) {
        List<Car> carList = racingGame.getCarList();
        for (Car car : carList) {
            System.out.println(car.resultString());
        }
        int maxPoint = GameHelperUtil.getMaxPosition(carList);

        String winnerList = GameHelperUtil.getWinnerToString(carList,maxPoint);

        System.out.println(winnerList + "가 최종 우승하였습니다");
    }
}

package racing.views;

import racing.RacingGame;
import racing.player.Car;
import racing.result.GameResult;

import java.util.Arrays;

public class ResultView {

    private static final int JUST_NUMBER_ONE = 1;

    private static void print(GameResult result) {
        System.out.println("실행 결과");
        for (Car car : result.cars) {
            System.out.println(car.name + "\t: " + getDistance(car));
        }
        System.out.println();
        System.out.println(GameResult.getWinnerNames(result.cars) + "가 최종 우승했습니다.");
    }

    public static void main(String[] args) {
        String carNames = InputView.carNames();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNames);

        for(;tryNo > 0; tryNo--) {
            print(racingGame.nextTurn());
        }
    }

    public static String getDistance(Car car) {
        return String.join("-", getEmptyArr(car.position + JUST_NUMBER_ONE));
    }

    private static String[] getEmptyArr(int length) {
        String[] arr = new String[length];
        Arrays.fill(arr, "");
        return arr;
    }
}

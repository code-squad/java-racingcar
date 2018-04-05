package racingGame;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    static void print(GameResult result) {
        ArrayList<Car> cars = result.getCars();
        for(Car car : cars) {
            printOneCar(car);
        }
        System.out.println("");
    }

    static void printOneCar(Car car) {
        int carPosition = car.getPosition();
        System.out.print(car.toString() + " : ");
        for(int i=0; i<carPosition; ++i) {
            System.out.print("-");
        }
        System.out.println("");
    }

    static void printWinner(GameResult result) {
        ArrayList<Car> winnerCars = GameResult.getWinnerCars(result);
        System.out.println(winnerCars.toString() + "가 최종 우승했습니다.");
    }
}

package racingGame;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    static int printAll(List<Car> cars) {
        int result=0;
        for(Car car : cars) {
            result += printCar(car);
        }
        System.out.println("");
        return result;
    }

    static int printCar(Car car) {
        int carPosition = car.getPosition();
        int result = 0;
        System.out.print(car.getName() + " : ");
        for(int i=0; i<carPosition; ++i) {
            System.out.print("-");
            result++;
        }
        System.out.println("");
        return result;
    }

    static int printWinner(ArrayList<Car> winnerCars) {
        System.out.println(winnerCars.toString() + "가 최종 우승했습니다.");
        return winnerCars.size();
    }
}

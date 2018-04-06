package racingcar;

import java.util.List;

public class RacingCarMain {
    public static void main(String[] args) {
        String[] cars = InputRacingCarView.inputCarNames();
        int move = InputRacingCarView.inputCarMove();

        RacingCar racingCar = new RacingCar(cars);
        List<Car> carInfo = null;

        for (int i = 0; i < move; i++) {
            carInfo = racingCar.carPositionMove();
            OutputRacingCarView.printCarPosition(carInfo);
            System.out.println();
        }

        OutputRacingCarView.printWinner(carInfo);
    }
}
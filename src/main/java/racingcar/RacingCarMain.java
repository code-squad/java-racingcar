package racingcar;

public class RacingCarMain {
    public static void main(String[] args) {
        String[] cars = InputRacingCarView.inputCarNames();
        int move = InputRacingCarView.inputCarMove();

        RacingCar racingCar = new RacingCar(cars);

        OutputRacingCarView.printRacing(racingCar, move);
        OutputRacingCarView.printWinner(racingCar);
    }
}
package racingcar;

public class RacingCarMain {
    public static void main(String[] args) {

        int car = InputRacingCarView.inputCarNumber();
        int move = InputRacingCarView.inputCarMove();

        RacingCar racingCar = new RacingCar(car);

        OutputRacingCarView.printRacing(racingCar, move);
    }
}
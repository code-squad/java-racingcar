package racingcar;

public class RacingCarMain {
    public static void main(String[] args) {
        String[] cars = InputRacingCarView.inputCarNames();
        int move = InputRacingCarView.inputCarMove();

        Racing racing = new Racing(cars);

        for (int i = 0; i < move; i++) {
            racing.carPositionMove();
            OutputRacingCarView.printCarPosition(racing);
            System.out.println();
        }

        OutputRacingCarView.printWinner(racing.returnRacingWinningResult());
    }
}
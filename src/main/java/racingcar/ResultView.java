package racingcar;

public class ResultView {

    public static void main(String[] args) {
        Run run = new Run();

        String inputCar = InputView.input();
        String[] car = run.carNumverCut(inputCar);
        int time = InputView.moveNumber();
        run.play(car, time);
    }
}

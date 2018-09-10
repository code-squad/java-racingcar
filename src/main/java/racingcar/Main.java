package racingcar;

public class Main {

    public static void main(String[] args) {
        String[] carNames = InputView.inputCars();
        int time = InputView.inputTime();

        Racing race = new Racing(time, carNames);
        race.run();

        ResultView.printResult(race.getCars());
    }
}

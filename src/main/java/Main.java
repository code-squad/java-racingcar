/**
 * Created by hoon on 2018. 1. 6..
 */
public class Main {

    public static void main(String args[]) {

        String carNames = InputView.readCarNames();
        int raceNum = InputView.readRaceNum();

        Racing racing = new Racing(carNames, raceNum);
        racing.doRace();

        ResultView.printResult(racing.getCars());
    }
}

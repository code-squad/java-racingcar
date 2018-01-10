/**
 * Created by hoon on 2018. 1. 6..
 */
public class Main {

    public static void main(String args[]) {

        int carNum = InputView.readCarNum();
        int raceNum = InputView.readRaceNum();

        Racing racing = new Racing(carNum, raceNum);
        racing.doRace();

        ResultView.printResult(racing.getCars());
    }
}

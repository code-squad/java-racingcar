package racingCar;
import java.util.List;

public class ResultView {
    private static final String BLANK = " ";
    private static final String BAR = "-";

    public void result(List<Car> recordResult) {

        for (int i = 0; i < recordResult.get(0).getBarHistory().size(); i++) {
            showCurrentBar(recordResult, i);
            blank();
        }
    }

    private void showCurrentBar(List<Car> recordResult, int i) {
        for (int j = 0; j < recordResult.size(); j++) {
            makeBar(recordResult.get(j).getBarHistory().get(i));
        }
    }

    private void blank() {
        System.out.println(BLANK);
    }

    public void makeBar(int record) {
        String status = BLANK;
        for (int startPostion = 1; startPostion <= record; startPostion++) {
            status += BAR;
        }
        System.out.println("CAR" + status);

    }
}

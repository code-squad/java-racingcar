package car;

import java.util.List;

import static car.RacingUtils.printRacingUi;
import static car.RacingUtils.resultFormatting;

public class RacingView {
    private CarRacing carRacing;

    private RacingView(CarRacing carRacing) {
        this.carRacing = carRacing;
    }

    public static RacingView createView(CarRacing carRacing) {
        return new RacingView(carRacing);
    }

    public void printResult() {
        List<Car> cars = carRacing.startRacing();

        print("실행 결과");
        printRacingUi(cars);
        print(resultFormatting(carRacing.getWinners()));
    }

    private static void print(String value) {
        System.out.println(value);
    }
}

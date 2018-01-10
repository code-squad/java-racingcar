package car;

public class Main {

    public static void main(String[] args) {
        String names[] = RacingInput.getNames();
        int tryCount = RacingInput.getTryCount();

        CarRacing carRacing = CarRacing.readyForRacing();
        carRacing.createCarsByName(names);
        carRacing.setTryCount(tryCount);

        RacingView racingView = new RacingView(carRacing);
        racingView.printResult();
    }
}

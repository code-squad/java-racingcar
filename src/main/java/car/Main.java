package car;

public class Main {

    public static void main(String[] args) {
        String names[] = RacingInput.getNames();
        int tryCount = RacingInput.getTryCount();

        CarRacing carRacing = CarRacing.readyForRacing(names, tryCount);
        RacingView.createView(carRacing).printResult();
    }
}

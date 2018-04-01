package racinggame;

import java.util.List;

public class DefaultRacingGameView implements RacingGameView {

    private final static String OUTPUT_FORMAT = "-";

    @Override
    public void printAll(List<Car> carList) {
        carList.forEach(car->print(car.getPosition()));
        nextLine();
    }

    private void print(int position) {
        for (int i = 0; i < position; i++)
            System.out.print(OUTPUT_FORMAT);
        nextLine();
    }

    private void nextLine() {
        System.out.println();
    }
}

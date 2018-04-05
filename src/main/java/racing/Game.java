package racing;

import static racing.DrawCars.*;
import static racing.Racing.startRace;

public class Game {

    public static void main(String[] args) {

        int howManyCars = InputView.getCarNumber();
        int howMuchTimes = InputView.getTimesNumber();

        System.out.println("");
        System.out.println("");

        if (howManyCars > 0 && howMuchTimes > 0)
            drawCars(startRace(howManyCars, howMuchTimes));
    }

}

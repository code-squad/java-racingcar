package racing;

import static racing.DrawCars.*;
import static racing.GameResult.*;
import static racing.Racing.startRaceWithName;

public class Game {

    public static void main(String[] args) {

        String[] carNames = InputView.getCarNames();
        int howMuchTimes = InputView.getTimesNumber();

        System.out.println("");
        System.out.println("");

        if (carNames.length > 0 && howMuchTimes > 0)
            showWinners(drawCarsWithName(startRaceWithName(carNames, howMuchTimes)));
    }

}

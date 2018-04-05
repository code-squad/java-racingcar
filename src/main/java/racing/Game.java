package racing;

import static racing.DrawCars.*;
import static racing.Racing.startRace;
import static racing.Racing.startRaceWithName;


public class Game {

    public static void main(String[] args) {

//        int howManyCars = InputView.getCarNumber();
//        int howMuchTimes = InputView.getTimesNumber();

        String[] carNames = InputView.getCarNames();
        int howMuchTimes = InputView.getTimesNumber();

        System.out.println("");
        System.out.println("");

        if (carNames.length > 0 && howMuchTimes > 0)
            showWinners(drawCarsWithName(startRaceWithName(carNames, howMuchTimes)));
    }

}

package racing;

import java.util.ArrayList;
import java.util.List;

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
            showWinners(drawCarsWithName(startRaceWithName(makeCarsList(carNames), howMuchTimes, carNames.length), carNames.length));

    }

    private static List<Car> makeCarsList(String[] carNames) {

        List<Car> carList = new ArrayList<>();

        for (String name : carNames)
            carList.add(new Car(name, 0));

        return carList;
    }

}

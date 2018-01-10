import In.Input;
import car.Race;
import print.Print;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> carNames = Arrays.asList(Input.inputCars().split(","));
        Race race = new Race(carNames, Input.inputTryNumber());
        Print print = new Print();

        race.startRacing();

        print.printCarsMove(race.getCars());
        print.printWinner(race.calCulateWinners(race.getCars()));

    }
}

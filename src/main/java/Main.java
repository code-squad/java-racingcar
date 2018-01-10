import In.Input;
import car.Race;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> carNames = Arrays.asList(Input.inputCars().split(","));
        Race race = new Race(carNames, Input.inputTryNumber(), 9, 4);
        race.startRacing();
        race.printRacing();
    }
}

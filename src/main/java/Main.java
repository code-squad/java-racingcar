import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();

        String[] carNames = consoleView.askCarCount();
        int racingCount = consoleView.askRacingCount();

        List<Car> cars = initCars(carNames);

        RacingGame racingGame = new RacingGame(racingCount, cars);
        racingGame.runGames();
        consoleView.printCarPositions(racingGame.getCars());
    }

    public static List<Car> initCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i]));
        }
        return cars;
    }

}

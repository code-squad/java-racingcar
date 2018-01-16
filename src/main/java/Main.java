import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();

        int carCount = consoleView.askCarCount();
        int racingCount = consoleView.askRacingCount();

        List<Car> cars = initCars(carCount);

        RacingGame racingGame = new RacingGame(racingCount, cars);
        racingGame.runGames();
        consoleView.printCarPositions(racingGame.getCars());
    }

    public static List<Car> initCars(int carCount) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carCount; i++) {
            cars.add(new Car());
        }
        return cars;
    }

}

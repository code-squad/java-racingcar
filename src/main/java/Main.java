import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();

        int carCount = consoleView.askCarCount();
        int racingCount = consoleView.askRacingCount();

        ArrayList<Car> cars = initCars(carCount);

        RacingGame racingGame = new RacingGame(racingCount, cars);
        racingGame.runGames();
        consoleView.printCarPositions(racingGame.getCars());
    }

    public static ArrayList<Car> initCars(int carCount) {
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < carCount; i++) {
            cars.add(new Car());
        }
        return cars;
    }

}

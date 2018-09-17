package racingcar;

public class RacingGame {
    Car[] cars;

    public static void createCars(RacingGame game){
        String[] users = InputView.userName();
        game.cars = new Car[users.length];
        makeCar(users, game);
    }

    public static void makeCar(String[] users, RacingGame game){
        for (int i = 0; i < game.cars.length; i++) {
            Car car = new Car(users[i]);
            game.cars[i] = car;
        }
    }

    public static void timer( RacingGame game) {
        int time = InputView.time();
        for (int i = 0; i < time; i++) {
            runCar(game.cars);
        }
    }

    public static void runCar(Car[] cars) {
        for (int j = 0; j < cars.length; j++) {
            cars[j].run();
        }
    }

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        createCars(game);
        timer(game);
        ResultView.output(game.cars);
    }
}


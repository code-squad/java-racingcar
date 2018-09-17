package racingcar;

public class RacingGame {
    static Car[] cars;
    static String[] users;

    RacingGame(int carNum){
        cars = new Car[carNum];
        makeCar(users);
    }

    public void makeCar(String[] users){
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car(users[i]);
            cars[i] = car;
        }
    }

    public void move(int time) {
        for (int i = 0; i < time; i++) {
            runCar(cars);
        }
    }

    public void runCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].run();
        }
    }

    public static void main(String[] args) {
        users = InputView.userName();
        int carNum = users.length;
        int time = InputView.time();

        RacingGame game = new RacingGame(carNum);
        game.move(time);
        ResultView.output(cars);
    }
}


package racingcar;

public class RacingGame {
    Car[] carArr;

    public static void createCarArr(RacingGame game){
        String[] userArr = InputView.userName();
        game.carArr = new Car[userArr.length];
        makeCar(userArr, game);
    }

    public static void makeCar(String[] userArr, RacingGame game){
        for (int i = 0; i < game.carArr.length; i++) {
            Car car = new Car(userArr[i]);
            game.carArr[i] = car;
        }
    }

    public static void timer( RacingGame game) {
        int time = InputView.time();
        for (int i = 0; i < time; i++) {
            runCar(game.carArr);
        }
    }
    public static void runCar(Car[] carArr) {
        for (int j = 0; j < carArr.length; j++) {
            carArr[j].run();
        }
    }

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        createCarArr(game);
        timer(game);
        ResultView.output(game.carArr);
    }
}


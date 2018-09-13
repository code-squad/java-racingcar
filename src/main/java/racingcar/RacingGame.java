package racingcar;

public class RacingGame {
    int[] carPositions;
    public static void main(String[] args) {
        InputView input = new InputView();
        RacingGame game = new RacingGame();

        String[] userArr = input.userName();
        int time = input.time();

        Car[] carArr = new Car[userArr.length];

        for (int i = 0; i < userArr.length; i++) {
            Car car = new Car(userArr[i]);
            carArr[i] = car;
            carArr[i].moveRanCreate(time);
        }

        game.carPositions = new int[userArr.length];

        ResultView result = new ResultView(game, carArr);

        result.output();
    }





}


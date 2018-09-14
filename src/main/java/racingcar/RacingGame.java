package racingcar;

public class RacingGame {

    public static void main(String[] args) {
        String[] userArr = InputView.userName();
        int time = InputView.time();
        Car[] carArr = new Car[userArr.length];
        for (int i = 0; i < userArr.length; i++) {
            Car car = new Car(userArr[i]);
            carArr[i] = car;
        }
        for (int i = 0; i < time; i++) {
            runCar(carArr);
        }
        int[] carPositions = new int[userArr.length];
        ResultView.output(carPositions, carArr);
    }

    public static void runCar(Car[] carArr){
        for (int j = 0; j < carArr.length; j++) {
            carArr[j].run();
        }
    }





}


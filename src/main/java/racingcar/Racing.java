package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Racing {
    public static final int POS_BOUND = 10;
    public static final int POS_STD = 4;

    private int time;
    private static ArrayList<Car> carList = new ArrayList<>();

    public Racing(int time, String[] carNames) {
        this.time = time;
        init(carNames);
    }

    public void init(String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            Car car = new Car(carNames[i], 1);
            carList.add(car);
        }
    }

    public void run() {
        for (int i = 0; i < time; i++) {
            selectCar(i);
        }
    }

    public void selectCar(int i) {
        for (Car car : carList) {
            posAdd(car);  // move each car
        }
    }

    public void posAdd(Car car) {
        Random random = new Random();
        int posAdder = random.nextInt(POS_BOUND);
        if (posAdder >= POS_STD) {
            car.carPosition++;
        }
    }

    public static ArrayList<Car> getCarList() {
        return carList;
    }

    public static void main(String[] args) {
        InputView.userInput();
        Racing racing = new Racing(InputView.getTime(), InputView.getCarNames().split(","));
        racing.run();
        ResultView.print();
    }
}

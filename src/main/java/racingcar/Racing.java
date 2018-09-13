package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Racing {
    public static final int POS_BOUND = 10;
    public static final int POS_CAR_INIT = 1;

    private static int time;
    private ArrayList<Car> carList = new ArrayList<>();

    public Racing(String[] carNames) {
        init(carNames);
    }

    public void init(String[] carNames) {
        for (String carName : carNames) {
            Car car = new Car(carName, POS_CAR_INIT);
            carList.add(car);
        }
    }

    public void run() {
        for (int i = 0; i < time; i++) {
            selectCar();
        }
    }

    public void selectCar() {
        for (Car car : carList) {
            addPos(car);  // move each car
        }
    }

    public void addPos(Car car) {
        Random random = new Random();
        car.addPosition(random.nextInt(POS_BOUND));
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public static void main(String[] args) {
        ArrayList<String> racingInfos = InputView.userInput();
        Racing.time = Integer.parseInt(racingInfos.get(1));
        Racing racing = new Racing(racingInfos.get(0).split(","));
        racing.run();
        ResultView.printPos(racing.getCarList());
        ResultView.printResult(racing.getCarList());
    }
}

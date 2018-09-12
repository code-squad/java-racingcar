package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Racing {
    public static final int POS_BOUND = 10;
    public static final int POS_STD = 4;

    private int time;
    private ArrayList<Car> carList = new ArrayList<>();

    public Racing(int time, String[] carNames) {
        this.time = time;
        init(carNames);
    }

    public void init(String[] carNames) {
        for (String carName : carNames) {
            Car car = new Car(carName, 1);
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
            car.addPosition();  // to avoid setter method, I made BEHAVIOR method
        }
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public static void main(String[] args) {
        ArrayList<String> inputValue = InputView.userInput();
        Racing racing = new Racing(Integer.parseInt(inputValue.get(1)), inputValue.get(0).split(","));
        racing.run();
        ResultView.printPos(racing.getCarList());
        ResultView.printResult(racing.getCarList());
    }
}

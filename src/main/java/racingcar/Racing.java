package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Racing {
    private int time;
    private int carNum;
    public static ArrayList<Car> carList = new ArrayList<>();
    public static ArrayList<Car> resultList = new ArrayList<>();

    public Racing(int time, String[] carNames) {
        this.time = time;
        this.carNum = carNames.length;
        init(carNames);
    }

    public void init(String[] carNames) {
        for (int i = 0; i < carNum; i++) {
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
        for (int j = 0; j < carNum; j++) {
            posAdd(j);  // move each car
        }
    }

    public void posAdd(int j) {
        Random random = new Random();
        int posAdder = random.nextInt(10);
        if (posAdder >= 4) {
            int nowPos = carList.get(j).getCarPosition();
            carList.get(j).setCarPosition(nowPos + 1);
        }
    }

    public static void main(String[] args) {
        InputView input = new InputView();
        ResultView result = new ResultView();

        input.userInput();
        Racing racing = new Racing(input.time, input.carNames.split(","));
        racing.run();
        result.print();
    }
}

import java.util.ArrayList;
import java.util.Random;

public class RacingGame {

    private Random random;
    private int time;
    private ArrayList<Car> cars;

    public RacingGame(int carCount, int time) {
        this.random = new Random();
        this.time = time;

        initCars(carCount);
    }

    public void start() {
        for (int i = 0; i < time; i++) {
            moveCars();
        }
    }

    public void printResult() {
        System.out.println("========= 결과 =========");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println("========================");
    }

    private void initCars(int carCount) {
        cars = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car());
        }
    }

    private void moveCars() {
        for (Car car : cars) {
            car.move(random.nextInt(10));
        }
    }

    public int getTime() {
        return time;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

}

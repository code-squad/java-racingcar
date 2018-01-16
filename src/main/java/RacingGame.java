import java.util.ArrayList;
import java.util.Random;

public class RacingGame {

    private Random random;
    private int time;
    private ArrayList<Car> cars;

    public RacingGame(String[] names, int time) {
        this.random = new Random();
        this.time = time;
        initCars(names);
    }

    public void start() {
        for (int i = 0; i < time; i++) {
            moveCars();
        }
    }

    public void printResult() {
        System.out.println("\n실행 결과");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    public void printWinners() {
        ArrayList<Car> winners = getWinners();

        StringBuilder stringBuilder = new StringBuilder("\n");

        for (Car winner : winners) {
            stringBuilder.append(winner.getName());
            stringBuilder.append(", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("이(가) 최종 우승했습니다.");

        System.out.println(stringBuilder.toString());
    }

    private ArrayList<Car> getWinners() {
        ArrayList<Car> winners = (ArrayList<Car>) cars.clone();

        int maxPosition = getMaxPosition();

        winners.removeIf(car -> car.getPosition() < maxPosition);

        return winners;
    }

    private void initCars(String[] names) {
        cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
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

    public int getMaxPosition() {
        int maxPosition = 0;

        for (Car car : cars) {
            maxPosition = car.getPosition() > maxPosition ? car.getPosition() : maxPosition;
        }

        return maxPosition;
    }
}

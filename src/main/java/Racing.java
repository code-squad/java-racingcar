import java.util.ArrayList;
import java.util.Arrays;

public class Racing {

    private ArrayList<Car> cars = new ArrayList<Car>();

    public Racing(String names) {
        String[] carNames = names.split(",");
        this.cars = makeCarList(carNames);
    }

    public static int getRandomInt() {
        int randomNum = (int) (Math.random() * 9);
        return randomNum;
    }

    public ArrayList<Car> makeCarList(String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i]));
        }
        return cars;
    }

    public static void doRace(Car car, int times) {
        for (int i = 0; i < times; i++) {
            car.oneRun(Racing.getRandomInt());
        }
    }

    public void wholeRace(ArrayList<Car> cars, int times) {
        for (Car car : cars) {
            doRace(car, times);
        }
    }

    public static int selectMaxPosition(int[] positions) {
        Arrays.sort(positions);
        int max = positions[positions.length - 1];
        return max;
    }

    public static int[] makePositions(ArrayList<Car> cars) {
        int[] positions = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            positions[i] = cars.get(i).getPosition();
        }
        return positions;
    }

    public static ArrayList<String> selectWinners(ArrayList<Car> cars) {
        ArrayList<String> winners = new ArrayList<String>();
        int[] positions = makePositions(cars);
        int winnerPosition = selectMaxPosition(positions);
        for (Car car : cars) {
            if (car.isWinnerPosition(winnerPosition)) winners.add(car.getName());
        }
        return winners;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<String> getWinnerList() {
        return selectWinners(cars);
    }

    public void run(int times) {
        wholeRace(cars, times);
    }
}


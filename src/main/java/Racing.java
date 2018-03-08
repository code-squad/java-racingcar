import java.util.ArrayList;
import java.util.Arrays;

public class Racing {
    private int times;
    private ArrayList<Car> cars = new ArrayList<Car>();
    private static ArrayList<String> winners = new ArrayList<String>();

    public Racing(String names, int times) {
        String[] carNames = names.split(",");
        this.cars = makeCarList(carNames);
        this.times = times;
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

    public static void doRace(Car c, int times) {
        for (int i = 0; i < times; i++) {
            c.oneRun(Racing.getRandomInt());
        }
    }

    public void race(ArrayList<Car> carList) {
        for (Car c : carList) {
            doRace(c, this.times);
        }
    }

    public static int selectMaxPosition(int[] positions) {
        Arrays.sort(positions);
        int max = positions[positions.length - 1];
        return max;
    }

    public static int[] makePositions(ArrayList<Car> cars, int times) {
        int[] positions = new int[times];
        for (int i = 0; i < cars.size(); i++) {
            positions[i] = cars.get(i).getPosition();
        }
        return positions;
    }

    public static ArrayList<String> selectWinners(ArrayList<Car> cars, int times) {
        ArrayList<String> winner = new ArrayList<String>();
        int[] positions = makePositions(cars, times);
        int winnerPosition = selectMaxPosition(positions);
        for (Car c : cars) {
            if (c.isWinnerPosition(winnerPosition)) winner.add(c.getName());
        }
        return winner;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<String> getWinnerList() {
        return winners;
    }

    public void run() {
        race(cars);
        winners = selectWinners(cars, times);
    }
}


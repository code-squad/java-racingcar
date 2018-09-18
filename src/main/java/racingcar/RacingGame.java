package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class RacingGame {
    private static int RANGE = 10;
    private ArrayList<Car> cars;

    public RacingGame (String names) {
        ArrayList<Car> cars = new ArrayList<>();
        String name[] = names.split(",");

        for(int i=0; i<name.length; i++) {
            cars.add(new Car(name[i]));
        }
        this.cars = cars;
    }

    public void racing(int tryNo) {
        for(int i = 0; i < tryNo; i++) {
            playGame();
        }
    }

    public void playGame() {
        Random random = new Random();
        for (Car car : cars) {
            car.moveCar(random.nextInt(RANGE));
        }
    }

    public ArrayList<Car> getResult() {
        return this.cars;
    }

    public static ArrayList<Car> findWinners(ArrayList<Car> cars) {
        ArrayList<Car> winners = new ArrayList<>();
        int maxPosition = 0;

        maxPosition = getMaxPosition(cars);

        for (Car car : cars) {
            addWinners(car, winners, maxPosition);
        }
        return winners;
    }

    public static int getMaxPosition(ArrayList<Car> cars) {
        int max = 0;
        for (Car car : cars) {
            max = car.getMaxPosition(max);
        }
        return max;
    }

    private static void addWinners(Car car, ArrayList<Car> winners, int maxPosition) {
        if(car.isMaxPosition(maxPosition)) {
            winners.add(car);
        }
    }

    public static String generateWinnerText(ArrayList<Car> cars) {
        String winnersText = "";
        for(int i=0; i<cars.size()-1; i++) {
            winnersText += cars.get(i).getName() + ",";
        }
        winnersText += cars.get(cars.size()-1).getName();
        return winnersText;
    }
}

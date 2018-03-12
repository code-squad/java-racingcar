package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRaceUtill {
	private static final int RANDOM_ROOT = 10;
    private List<Car> cars = new ArrayList<>();

    //make Car Array
    public CarRaceUtill(String[] carNames) {
        for (String names : carNames) {
            cars.add(new Car(names));
        }
    }

    //moving car
    public void moveCars(int tryNum) {
        for (int i = 0; i < tryNum; i++) {
            makeCarMove();
        }
    }

    private void makeCarMove() {
        for (Car car : cars) {
            car.move(makeRandomNumber());
        }
    }
    
    //random number
    public int makeRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_ROOT);
    }
    
    public void printAllCarDistance() {
    		for (Car car : cars) {
    			ResultView.printDashForEachCar(car.getName(), car.getPosition());
    			System.out.println();
    		}
    }
    
    public void printWinner() {
    		ResultView.printWinner(getWinner(topPosition()));
    }
    //winner
    public String getWinner(int maxDistance) {

        List<String> winnerNames = new ArrayList<>();

        for(Car car : cars) {
            if(car.getPosition() == maxDistance) {
                winnerNames.add(car.getName());
            }
        }
        return String.join(", ",winnerNames);
    }

    //topPosition
    public int topPosition() {
        int top = 0;
        for (Car car : cars) {
            if (top <= car.getPosition()) {
                top = car.getPosition();
            }
        }
        return top;
    }

    public List<Car> getCars() {
        return cars;
    }
}

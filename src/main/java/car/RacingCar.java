package car;
import java.util.ArrayList;
import java.util.Random;

public class RacingCar {
	public static ArrayList<Car> initializeCar(ArrayList<String> carNameList, ArrayList<Car> cars) {
		for (int i = 0; i < carNameList.size(); i++) {
			cars.add(i, new Car(carNameList.get(i)));
		}
		return cars;
	}
	public static String[] splitName(String carName) {
		return carName.split(" ");
	}
	public static void startRace(ArrayList<Car> cars) {
		ArrayList<Integer> carLocation = new ArrayList<Integer> (cars.size());
		for (int i = 0; i < cars.size(); i++) {
			Random randomNum = new Random();
			int moveDice = randomNum.nextInt(11);

			carLocation.add(i, cars.get(i).move(moveDice));
		}
	}
	public static int returnBiggest(int distance, int biggest) {
		if (distance > biggest) {
			return distance;
		}
		return biggest;
	}
	public static int findBiggest(ArrayList<Integer> distance) {
		int biggest = 0;
		for (int i = 0; i < distance.size(); i++) {
			biggest = returnBiggest(distance.get(i), biggest);
		}
		return biggest;
	}
}

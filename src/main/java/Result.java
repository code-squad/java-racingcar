import java.util.ArrayList;
import java.util.Collections;

public class Result {
	static void show(ArrayList<Car> listCar) {
		for (int i = 0; i < listCar.size(); i++) {
			System.out.println(listCar.get(i).getName() +  " : " + listCar.get(i).makeDash());
		}
		System.out.println("");
	}
	
	static void showWinner(ArrayList<Car> listCar) {
		ArrayList<Integer> positions = new ArrayList<>();
		for (int i = 0; i < listCar.size(); i++) {
			positions.add(listCar.get(i).getPosition());
		}
		System.out.print("최종 우승자 : ");
		for (int i = 0; i < listCar.size(); i++) {
			if(Collections.max(positions) == listCar.get(i).getPosition()) {
				System.out.print(listCar.get(i).getName() + " ");
			}
		}
	}
	
	static int findMaxPosition(ArrayList<Car> cars) {
		int max = 0;
		for (Car car : cars) {
			max = Math.max(max, car.getPosition());
		}
		return max;
	}
	
	static ArrayList<Car> findWinnerCar(ArrayList<Car> cars, int max) {
		ArrayList<Car> winnerCars = new ArrayList<Car>();
		for (Car car : cars) {
			checkWinnerCar(max, winnerCars, car);
		}
		return winnerCars;
	}

	private static void checkWinnerCar(int max, ArrayList<Car> winnerCars, Car car) {
		if (max == car.getPosition()) {
			winnerCars.add(car);
		}
	}
	
	static void showWinnerCar(ArrayList<Car> winnerCars) {
		System.out.print("최종 우승자 : ");
		for (Car car : winnerCars) {
			System.out.print(car.getName() + " ");
		}
	}
	
	
	// int max = findMaxPositions(listCar);
	// ArrayList<Car> winnerCars = findWinnderCars(listCar, max);
	// print(winnerCars);
}


import java.util.ArrayList;

public class CarRacing {
	public static void main(String[] args) {
		String[] names = Input.getNames();
		int time = Input.getTime();
		ArrayList<Car> listCar = Car.createCars(names);
		for (int i = 0; i < time; i++) {
			Car.runCars(listCar);
			Result.show(listCar);
		}
		int max = Result.findMaxPosition(listCar);
		ArrayList<Car> winnerCars = Result.findWinnerCar(listCar, max);
		Result.showWinnerCar(winnerCars);
	}
}

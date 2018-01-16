package will;
import java.util.ArrayList;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Result {
	private static final Logger log = LoggerFactory.getLogger(Result.class);
	
	static void show(ArrayList<Car> listCar) {
		for (int i = 0; i < listCar.size(); i++) {
			log.info(listCar.get(i).getName() +  " : " + listCar.get(i).makeDash());
		}
		log.info("");
	}
	
	static void showWinner(ArrayList<Car> listCar) {
		ArrayList<Integer> positions = new ArrayList<>();
		for (int i = 0; i < listCar.size(); i++) {
			positions.add(listCar.get(i).getPosition());
		}
		log.debug("최종 우승자 : ");
		for (int i = 0; i < listCar.size(); i++) {
			if(Collections.max(positions) == listCar.get(i).getPosition()) {
				log.debug(listCar.get(i).getName() + " ");
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
		log.info("최종 우승자 : ");
		for (Car car : winnerCars) {
			log.info("{} ", car.getName());
		}
	}
}

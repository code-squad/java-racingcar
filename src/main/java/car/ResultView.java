package car;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultView {
	private static final Logger log = LoggerFactory.getLogger(ResultView.class);

	public static void drawEachCar(String name, int numToDraw) {
		String result = "-";
		int drawCount = numToDraw;
		while (drawCount > 0) {
			result += "-";
			drawCount--;
		}
		log.info(name + " : " + result);
	}
	public static void draw(ArrayList<String> name, ArrayList<Integer> carDistance) {
		log.info("--------------------------START--------------------------");
		for (int i = 0; i < carDistance.size(); i++) {
			drawEachCar(name.get(i), carDistance.get(i));
		}
	}
	public static void noticeWinner(ArrayList<Car> winner) {
		for (int i = 0; i < winner.size(); i++) {
			log.info("우승자는 {} 입니다.", winner.get(i).getName());
		}
	}
	private static ArrayList<Car> addWinner(ArrayList<Car> winner, ArrayList<Car> cars, int count, int biggest) {
		if (cars.get(count).getPos() == biggest) {
			winner.add(cars.get(count));
		}
		return winner;
	}
	private static ArrayList<Car> makeWinnerList(ArrayList<Car> cars, int biggest) {
		ArrayList<Car> winnerList = new ArrayList<Car> ();
		for (int i = 0; i < cars.size(); i++) {
			winnerList = addWinner(winnerList, cars, i, biggest);
		}
		return winnerList;
	}
	public static void printWinner(int biggest, ArrayList<Car> cars) {
		ArrayList<Car> winnerCars = makeWinnerList(cars, biggest);
		noticeWinner(winnerCars);		//winnerList를 출력해준다.
	}
}

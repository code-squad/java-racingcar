import java.util.ArrayList;
import java.util.Collections;

public class Racing {
	public String[] carNames;
	public int times;
	public ArrayList<String> winner = new ArrayList<String>();
	public ArrayList<Car> carList = new ArrayList<Car>();

	public Racing(String[] carNames, int times) {
		this.carNames = carNames;
		this.times = times;
	}

	public static int getRandomInt() {
		int randomNum = (int) (Math.random() * 9);
		return randomNum;
	}

	public static boolean isGo(int randomNum) {
		if (getRandomInt() >= 4) {
			return true;
		}
		return false;
	}

	public void makeCarList(String[] carNames) {
		for (int i = 0; i < carNames.length; i++) {
			carList.add(new Car(carNames[i]));
		}
	}

	public void doRace(Car c, int times) {
		for (int i = 0; i < times; i++) {
			c.oneRun(c);
		}
	}

	public void race(ArrayList<Car> carList) {
		for (Car c : carList) {
			doRace(c, times);
		}
	}

	private void selectWinner(ArrayList<Car> carList) {
		Collections.sort(carList);
		int numCarList = carList.size();
		int winnerPosition = carList.get(numCarList - 1).getPosition();
		for (Car c : carList) {
			if (c.getPosition() == winnerPosition) {
				winner.add(c.getName());
			}
		}
		
	}

	public void run() {
		makeCarList(carNames);
		race(carList);
		selectWinner(carList);
	}

}
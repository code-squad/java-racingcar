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

	public int getRandomInt() {
		int randomNum = (int) (Math.random() * 9);
		return randomNum;
	}

	public boolean isGo() {
		if (getRandomInt() >= 4) {
			return true;
		}
		return false;
	}

	public int countRunning(int times) {
		int runCount = 0;
		for (int j = 0; j < times; j++) {
			if (isGo())
				runCount++;
		}
		return runCount;
	}

	public ArrayList<Car> race(String[] carNames) {
		for (int i = 0; i < carNames.length; i++) {
			carList.add(new Car(carNames[i]));
			carList.get(i).position = countRunning(times);
		}
		return carList;
	}

	private void selectWinner(ArrayList<Car> carList) {
		Collections.sort(carList);
		int numCarList = carList.size();
		int winnerPosition = carList.get(numCarList - 1).position;
		for (Car c : carList) {
			if (c.position == winnerPosition) {
				winner.add(c.name);
			}
		}
	}
	
	public void run() {
		selectWinner(race(carNames));
	}
	
}
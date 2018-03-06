import java.util.ArrayList;
import java.util.Collections;

public class Racing {
	private String[] carNames;
	private int times;
	private ArrayList<Car> carList = new ArrayList<Car>();
	private ArrayList<String> winner = new ArrayList<String>();

	public Racing(String carNamesOneString, int times) {
		carNames = carNamesOneString.split(",");
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
			if (isGo()) runCount++;
		}
		return runCount;
	}

	public void oneCarRunning(Car c) {
		System.out.printf("Car " + c.getName() + " >> ");
		for (int i = 0; i < c.getPosition(); i++) {
			System.out.printf("-");
		}
		System.out.println("");
	}

	private void selectWinner(ArrayList<Car> carList) {
		Collections.sort(carList);
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getPosition() == (carList.get(carList.size() - 1).getPosition())) {
				winner.add(carList.get(i).getName());
			}
		}
	}

	public void run() {
		for (int i = 0; i < carNames.length; i++) {
			carList.add(new Car(carNames[i]));
			carList.get(i).setPosition(countRunning(times));
			oneCarRunning(carList.get(i));
		}
		selectWinner(carList);
	}

	public ArrayList<String> getWinner() {
		return winner;
	}

}
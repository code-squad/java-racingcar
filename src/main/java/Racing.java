public class Racing {
	private int numCar;
	private int times;

	public Racing(int numCar, int times) {
		this.numCar = numCar;
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

	public void runRace() {
		if (isGo())
			System.out.print("-");
	}

	public void oneCarRunning(int times) {
		for (int j = 0; j < times; j++) {
			runRace();
		}
		System.out.println("");
	}

	public void run() {
		for (int i = 0; i < numCar; i++) {
			System.out.printf("Car #" + (i + 1) + " >>> ");
			oneCarRunning(times);
		}
	}

}
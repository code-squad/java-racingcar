package racingcar.model;

public class Racing {
	private Cars cars = null;
	private int moveCount;

	public Racing(String carNames, int moveCount) {
		cars = new Cars();
		parseCar(carNames);
		this.moveCount = moveCount;
	}

	private void parseCar(String fullString) {
		for (String name : fullString.split(",")) {
			cars.add(new Car(name));
		}
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public Cars getCars() {
		return cars;
	}
	
	public void sortByPosition() {
		cars.sortByPosition();
	}

	public Cars getTopRankedCarList() {
		Cars topCars = new Cars();
		cars.sortByPosition();
		for (Car car : cars.getCars()) {
			if (car.getPosition() == cars.getPosition(0))
				topCars.add(car);
		}
		return topCars;
	}

//	private int getMaxPosition() {
//		int maxPosition = 0;
//		for (int i = 0; i < cars.size(); i++) {
//			if (maxPosition < cars.getPosition(i))
//				maxPosition = cars.getPosition(i);
//		}
//		return maxPosition;
//	}

	public void carsOnePhaseMove() {
		for (Car car : cars.getCars()) {
			car.move();
		}
	}

	public void carsAllPhaseMove() {
		for (int i = 0; i < moveCount; i++) {
			carsOnePhaseMove();
		}
	}
}
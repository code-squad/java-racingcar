package saru;

import java.util.*;

public class Racing {
	private int time = 0;
	private ArrayList<Car> carList;

	void listInit() {
		carList = new ArrayList<Car>();
	}

	int getRandNum() {
		Random random = new Random();
		int randNum = random.nextInt(10);
		return randNum;
	}

	boolean isCanMove(int randNum) {
		if (getRandNum() >= 4) {
			return true;
		}

		return false;
	}

	void loopCarListProc(int index) {
		for (int i = 0; i < time; i++) {
			int randNum = getRandNum();
			moveAhead(randNum, index);
		}
	}

	void carProc() {
		for (int i = 0; i < carList.size(); i++) {
			loopCarListProc(i);
		}
	}

	void moveAhead(int randNum, int index) {
		if (isCanMove(randNum)) {
			// 리스트 요소 접근 해서 ++
			Car localCar = carList.get(index);
			localCar.moveCar();
		}
	}

	ArrayList<Car> cloneList(ArrayList<Car> cars) {
		ArrayList<Car> toReturnList = new ArrayList<Car>();
		for (Car car : cars) {
			toReturnList.add(cloneCar(car));
		}

		return toReturnList;
	}

	Car cloneCar(Car car) {
		Car toReturnCar = new Car(car.getName(), car.getPosition());

		return toReturnCar;
	}

	Car findBestCar() {
		ArrayList<Car> copyList = cloneList(carList);
		copyList.sort(new Comparator<Car>() {
			public int compare(Car car1, Car car2) {
				if (car1.getPosition() > car2.getPosition()) return 1;
				else if (car1.getPosition() < car2.getPosition()) return -1;
				return 0;
			}
		});

		return copyList.get(carList.size() - 1);
	}

	// 특정 조건에 맞는 요소를 지정 리스트에 추
	void addSpecificList(ArrayList<Car> returnList, int index, int bestPosition) {
		if (carList.get(index).isMatchPosition(bestPosition)) {
			returnList.add(carList.get(index));
		}
	}
	
	ArrayList<Car> loopResultListProc(int bestPosition) {
		ArrayList<Car> returnList = new ArrayList<Car>();
		for (int i = 0; i < carList.size(); i++) {
			addSpecificList(returnList, i, bestPosition);
		}
		
		return returnList;
	}

	ArrayList<Car> getResultList() {
		// 우승 조건 : 제일 많이 이동한 Car
		Car bestCar = findBestCar();

		// 1. 제일 많이 이동한 Car 찾아서 거리 저장
		int bestPosition = bestCar.getPosition();

		// 2. 리스트중에서 숫자와 같은것을 ArrayList 로 반환
		return loopResultListProc(bestPosition);
	}

	void insertCar(String[] names) {
		listInit();

		for (String name : names) {
			carList.add(new Car(name));
		}
	}

	public void run() {
		String[] stringArr = Utils.getInputName();
		insertCar(stringArr);
		time = Utils.getRunNumber();

		carProc();
		Utils.printAll(carList);

		ArrayList<Car> list = getResultList();
		Utils.printResult(list);
	}

	public static void main(String[] args) {
		Racing myRacing = new Racing();
		myRacing.run();
	}
}
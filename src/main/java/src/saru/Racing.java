package saru;

import java.util.*;

public class Racing {

	private static final int RAND_MAX_NUM = 10;

	private int time = 0;
	private ArrayList<Car> carList;

	public Racing() {
		carList = new ArrayList<Car>();
	}

	int getRandNum() {
		Random random = new Random();
		int randNum = random.nextInt(RAND_MAX_NUM);
		return randNum;
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
		Car localCar = carList.get(index);
		if (localCar.isCanMove(randNum)) {
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

	// 특정 조건에 맞는 요소를 지정 리스트에 추가
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

	void multiInsertCar(String[] names) {
		for (String name : names) {
			insertCar(name);
		}
	}

	void insertCar(String name) {
		carList.add(new Car(name));
	}

	boolean checkMove(int toCheckValue, int toCheckIndex) {
		return carList.get(toCheckIndex).isMatchPosition(toCheckValue);
	}

	// TODO 테스트용
	int getListSize() {
		return carList.size();
	}

	// TODO get메서드 안쓰고 어떻게?
	ArrayList<Car> getCarList() {
		return carList;
	}

	public void run(String[] stringArr, int runNum) {
		multiInsertCar(stringArr);
		time = runNum;

		carProc();
	}

	public static void main(String[] args) {
		String[] stringArr = Utils.getInputName();
		int runNum = Utils.getRunNumber();

		Racing myRacing = new Racing();
		myRacing.run(stringArr, runNum);

		Utils.printPositions(myRacing.getCarList());
		Utils.printResult(myRacing.getResultList());
	}
}
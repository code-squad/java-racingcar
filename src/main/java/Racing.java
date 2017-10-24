import java.util.Random;
import java.util.ArrayList;

public class Racing {

	private int time;
	Random random = new Random();

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public ArrayList<Car> createAllCars(ArrayList<String> carNames) {
		// 입력한 차 개수대로 객체를 만드는 메소드.
		ArrayList<Car> cars = new ArrayList<Car>();
		for (String carName : carNames) {
			Car car = new Car(carName);
			cars.add(car);
		}
		return cars;
	}

	public int run(Car car) {
		// 현재 position 반환.
		int num = random.nextInt(11);
		int position = car.getPosition();
		if (num >= 4) {
			position++;
		}
		car.setPosition(position);
		position = car.getPosition();
		return position;
	}
	public void returnCurrCarPosition(Car car) {
		// 차 하나 현재위치 값 계산 후 "-" 으로 변환 후 출력.
		int currCarPosition;
		String positionValue ="";
		StringProcess stringProcess = new StringProcess();
		currCarPosition = run(car);
		ArrayList<String> currPositionValue = stringProcess.changeTo_(currCarPosition);
		for (String value : currPositionValue) {
			positionValue += value;
		}
		System.out.print(car.getName() + ":" + positionValue + "\n");
	}

	public void printTry(ArrayList<Car> cars) {
		// 시도 한번 수행시 print 하는 메소드.
		for (Car car : cars) {
			returnCurrCarPosition(car);
		}
	}

	public void printAllTries(ArrayList<Car> cars, int numberOfTry) {
		// 전체 시도 모두 print 하는 메소드.
		setTime(numberOfTry);
		int numOfTry = getTime();
		for (int i = 0; i < numOfTry; i++) {
			printTry(cars);
			System.out.println("\n");
		}
	}
}

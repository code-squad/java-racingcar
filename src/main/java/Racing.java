import java.util.*;

public class Racing {

	private int time;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public List<Car> createAllCars(List<String> carNames) {
		// 입력한 차 개수대로 객체를 만드는 메소드.
		List<Car> cars = new ArrayList<Car>();
		for (String carName : carNames) {
			Car car = new Car(carName);
			cars.add(car);
		}
		return cars;
	}

	public String returnCurrCarPosition(Car car) {
		// 차 하나 현재위치 값 계산 후 "-" 으로 변환 후 출력.
		String positionValue ="";
		StringProcess stringProcess = new StringProcess();
		int currCarPosition = car.run();
		List<String> currPositionValue = stringProcess.changeTo_(currCarPosition);
		for (String value : currPositionValue) {
			positionValue += value;
		}
		return (car.getName() + ":" + positionValue + "\n");
	}

	
}

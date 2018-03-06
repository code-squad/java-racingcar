package racingcar;

public class CarArr {
	static Car[] cars(String[] nameArr) {   // Car타입의 객체 배열을 생성한다.
		Car[] cars = new Car[nameArr.length];
		for (int i = 0; i < nameArr.length; i++) {
			cars[i] = new Car(nameArr[i]);
		}
		return cars;
	}
}

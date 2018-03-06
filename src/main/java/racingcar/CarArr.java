package racingcar;

public class CarArr {
	static void makeCar(String[] nameArr) {   // Car타입의 객체 배열을 생성한다.
		Cars.carArray = new Car[nameArr.length];
		for (int i = 0; i < nameArr.length; i++) {
			Cars.carArray[i] = new Car(nameArr[i]);
		}
	}
}

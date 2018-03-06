package racingcar;

public class CarArray {
	private  Car[] carArray;	
	
	CarArray(String[] nameArr) {
		this.carArray = new Car[nameArr.length];
		for (int i = 0; i < nameArr.length; i++) {
			carArray[i] = new Car(nameArr[i]);
		}
	}
	
	Car[] getCarArr() {
		return carArray;
	}
}


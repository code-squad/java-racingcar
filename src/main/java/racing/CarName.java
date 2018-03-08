package racing;

public class CarName {
	
	public Car[] makeCar(String[] names){
	Car[] cars = new Car[names.length];
	for (int i = 0; i < names.length; i++) {
		cars[i] = new Car(names[i]);
	}
	return cars;
	}

}

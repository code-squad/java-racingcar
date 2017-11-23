import java.util.ArrayList;
import java.util.Random;

public class Car {
	private String name;
	private int position = 0;
	
	Car(String name) {
		this.name = name;
	}
	
	Car(String name, int position) {
		this.name = name;
		this.position = position;
	}
	
	String getName() {
		return this.name;
	}
	
	int getPosition() {
		return this.position;
	}
	
	private static int makeRandomNum() {
		Random random = new Random();
		int randomNum = random.nextInt(10);
		return randomNum;
	}
	
	void run(int randomNum) {
		if (randomNum >= 4) {
			this.position++;
		}
	}
	
	static void runCars(ArrayList<Car> listCar) {
		for (Car car: listCar) {
			int randomNumber = makeRandomNum();
			car.run(randomNumber);
		}
	}
	
	static ArrayList<Car> createCars(String[] names) {
		ArrayList<Car> listCar = new ArrayList<>();
		for (int i = 0; i < names.length; i++) {
			listCar.add(new Car(names[i]));
		}
		return listCar;
	}
	
	String makeDash() {
		String dash = "";
		for (int i = 0; i < this.position; i++) {
			dash += "-";
		}
		return dash;
	}
}

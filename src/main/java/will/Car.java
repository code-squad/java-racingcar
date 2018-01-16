package will;
import java.util.ArrayList;
import java.util.List;
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
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
	
	static void runCars(List<Car> cars) {
		for (Car car: cars) {
			int randomNumber = makeRandomNum();
			car.run(randomNumber);
		}
	}
	
	static List<Car> createCars(String names) {
		String[] temp = names.split(" ");
		ArrayList<Car> listCar = new ArrayList<>();
		for (int i = 0; i < temp.length; i++) {
			listCar.add(new Car(temp[i]));
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

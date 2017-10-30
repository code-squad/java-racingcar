import java.util.Random;

public class Car {
	private String name;
	private int position = 1;

	public Car(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int createSpeed() {
		// Creates speed randomly.
		Random random = new Random();
		return random.nextInt(11);
	}
	public void run() {
		// 현재 position 반환.
		if (createSpeed() >= 4) {
			position++;
		}
	}

	public int getPosition() {
		return position;
	}
	
}

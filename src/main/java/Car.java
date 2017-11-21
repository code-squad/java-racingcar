import java.util.Random;
import java.util.Scanner;

public class Car {
	private String name;
	private int position = 0;
	
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public int makeRandomNum() {
		Random random = new Random();
		int randomNum = random.nextInt(10);
		return randomNum;
	}
	
	public void run() {
		int randomNum = makeRandomNum();
		if (randomNum >= 4) {
			this.position++;
		}
	}
	
	public String makeDash() {
		run();
		String dash = "";
		for (int i = 0; i < this.position; i++) {
			dash += "-";
		}
		return dash;
	}

}

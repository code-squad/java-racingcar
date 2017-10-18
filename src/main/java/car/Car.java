package car;

import java.util.List;
import java.util.Random;

public class Car {

	private String name = null;
	
	private int position = 0;
	
	private int randomNumber = 0;
	
	public Car(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber() {
		Random rand = new Random();
		this.randomNumber = rand.nextInt(10);
	}
	
	public void move() { //plusPosition->move
		Random rand = new Random();
		if(rand.nextInt(10) > 3) {
			this.position ++;
			//setPosition(this.position + 1);
		}
	}
	public String getName() {
		return name;
	}
}

package car;

public class Car {

	private String name = null;
	
	public Car(String name) {
		this.name = name;
	}
	private int position = 0;

	private int randomNumber = 0;
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	public void plusPosition() {
		if(getRandomNumber() > 3) {
			setPosition(this.position + 1);
		}
	}
	public String getName() {
		return name;
	}
}

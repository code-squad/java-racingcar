package car;

public class Car {
//정보를 담는 클래스에 기능을 만들어도 되나? plusPosition 같이 +1 해주는 기능?
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
		setPosition(this.position + 1);
	}
	public String getName() {
		return name;
	}
}

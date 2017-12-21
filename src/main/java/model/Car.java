package model;
import java.util.Random;

public class Car {
	private String name;
	private int position = 1;

	public Car(String name){
		this.name = name;
	}
	
	public Car(String name, int position){
		this.name = name;
		this.position = position;
	}
	
	public int getPosition() {
		return position;
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
	// 두 객체가 같은 객체인지 비교.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + position;
		return result;
	}
	// 두 객체의 내용이 같은지 비교.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position != other.position)
			return false;
		return true;
	}
	
}

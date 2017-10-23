package model;

import java.util.Random;

public class Car {
	
	private int position;
	private String name;
	
	
	public Car(String name) {
		this.name = name;
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
	
	public void move() {
		if(new Random().nextInt(10) > 3) {
			this.position ++;
		}
	}

	public int testMove() {
		if(4 > 3) {
			this.position ++;
		}
		return this.getPosition();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

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
		return true;
	}

	@Override
	public String toString() {
		return "Car [position=" + position + ", name=" + name + "]";
	}
	
	
}

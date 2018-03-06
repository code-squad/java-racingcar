public class Car implements Comparable<Car> {
	private String name;

	private int position;

	public Car(String name) {
		this.setName(name);
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Car c) {
		if(this.position > c.position) return 1;
		else if (this.position < c.position) return -1;
		else return 0;
	}
}
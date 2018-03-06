public class Car implements Comparable<Car> {
	private String name;
	private int position;

	public Car(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	public void oneRun(Car c) {
		int value = Racing.getRandomInt();
		if (Racing.isGo(value))
			position++;
	}

	@Override
	public int compareTo(Car c) {
		if (this.position > c.position)
			return 1;
		else if (this.position < c.position)
			return -1;
		else
			return 0;
	}
}
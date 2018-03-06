public class Car implements Comparable<Car> {
	public String name;

	public int position;

	public Car(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public int compareTo(Car c) {
		if(this.position > c.position) return 1;
		else if (this.position < c.position) return -1;
		else return 0;
		
	}
}
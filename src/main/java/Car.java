
public class Car {
	private String name;
	
	private int position = 1;
	
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Car(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}

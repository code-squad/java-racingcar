package racingcar.domain;

public class Car {
	private String name;
	private int tripMeter = 0;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int move(int meter) {
		return tripMeter += meter;
	}
	
	public int getTripMeter() {
		return  tripMeter;
	}
}

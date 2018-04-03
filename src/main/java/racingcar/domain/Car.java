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
	
	public boolean isTripMeter(int tripMeter) {
		return  this.tripMeter == tripMeter;
	}

	public boolean isTripMeterGreaterThan(Car car) {
		return !car.isTripMeterGreaterThan(tripMeter);
	}

	public boolean isTripMeterGreaterThan(int tripMeter) {
		return this.tripMeter >= tripMeter;
	}
}

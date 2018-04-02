package racingcar.domain;

public class Car {
	private String name;
	private int tripMeter = 0;

	public Car() {}

	public Car(String name) {
		this.name = name;
	}

	public Car(String name, int tripMeter) {
		this.name = name;
		this.tripMeter = tripMeter;
	}

	public String getName() {
		return name;
	}
	
	public int move(Rule rule) {
		if(rule.isValid()) {
			tripMeter += rule.getMoveMeterForReward();
		}
		return tripMeter;
	}
	
	public int getTripMeter() {
		return  tripMeter;
	}
}
